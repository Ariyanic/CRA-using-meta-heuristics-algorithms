package ir.ui.se.mdserg.ACOwithATL;

import java.util.ArrayList;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;
import org.eclipse.m2m.atl.emftvm.Model;
import org.eclipse.m2m.atl.emftvm.impl.resource.EMFTVMResourceFactoryImpl;
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.ModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.TimingData;

import Path.Feature;


public class Main {

	final static String TRANSFORMATION_DIR = "src/ir/ui/se/mdserg/ACOwithATL/Transformations/";
	final static int iteration_count = 100000; 
	final static int population_size = 10; 
	final static double alpha = 1;
	final static double beta = 1;
	final static double rho = 0.1; // Evaporation rate
	final static double Q = 2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ACO Started...") ; 	
		long startTime = System.currentTimeMillis();
		
		ArrayList<Model> solutions = new ArrayList<>();
		
		CRAIndexCalculator.architectureRegisterPackage(); 
		CRAIndexCalculator.pathRegisterPackage();
		CRAIndexCalculator.rouletteWheelRegisterPackage();
		
		ResourceSet rs = new ResourceSetImpl();			
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("emftvm", new EMFTVMResourceFactoryImpl());

		Metamodel metaModel1 = EmftvmFactory.eINSTANCE.createMetamodel();
		metaModel1.setResource(rs.getResource(URI.createURI("http://momot.big.tuwien.ac.at/architectureCRA/1.0"), true));

		Metamodel metaModel2 = EmftvmFactory.eINSTANCE.createMetamodel();
		metaModel2.setResource(rs.getResource(URI.createURI("http://www.pathCRA.com"), true));
		
		Metamodel metaModel3 = EmftvmFactory.eINSTANCE.createMetamodel();
		metaModel3.setResource(rs.getResource(URI.createURI("http://www.RoleteWheel.com"), true));
			
		Model inModel = EmftvmFactory.eINSTANCE.createModel();
		inModel.setResource(rs.getResource(URI.createURI("src/ir/ui/se/mdserg/ACOwithATL/Models/a.xmi", true), true));

		Model completeInput = EmftvmFactory.eINSTANCE.createModel();
		completeInput.setResource(rs.createResource(URI.createURI("src/ir/ui/se/mdserg/ACOwithATL/Models/1completeInput.xmi")));
		transformation1(metaModel1, metaModel1, inModel, completeInput, TRANSFORMATION_DIR, "CompleteClassModel" ); 
		
		Model searchSpace = EmftvmFactory.eINSTANCE.createModel();
		searchSpace.setResource(rs.createResource(URI.createURI("src/ir/ui/se/mdserg/ACOwithATL/Models/2solutionSpace.xmi")));
		generationTransformation(metaModel1, metaModel2, completeInput, searchSpace, TRANSFORMATION_DIR, "searchSpace" ); 
		
		//Population generation for ACO Algorithm 
		ArrayList<Model> population = new ArrayList<Model>();
        double[] popCRA = new double[population_size];
        
        int gIndex = 0 ; 
	    for (int i = 0; i < population_size; i++) {
	    	
			Model popModel = EmftvmFactory.eINSTANCE.createModel();
			popModel.setResource(rs.createResource(URI.createURI("src/ir/ui/se/mdserg/ACOwithATL/Models/popModel"+ i +".xmi")));
			generationTransformation(metaModel1, metaModel2, inModel, popModel, TRANSFORMATION_DIR, "createApath" ); 
		
			population.add(popModel) ;
			
			popCRA[i] = CRAIndexCalculator.evaluateModel(popModel.getResource()) ; 
			
			double tau0 = 1;
			
			for(EObject f : popModel.getResource().getContents()) {    
				((Feature) f).setTau(tau0); 
	    		((Feature) f).setEta(popCRA[i]); 
				((Feature) f).setNumeratorP((((Feature) f).getTau() * alpha) + (((Feature) f).getEta() * beta));
			}
			
			Model tempSolutionSpace = EmftvmFactory.eINSTANCE.createModel();
			tempSolutionSpace.setResource(rs.createResource(URI.createURI("src/ir/ui/se/mdserg/ACOwithATL/Models/tempSolutionSpace" + i + ".xmi")));
			transformation2(metaModel2, metaModel2, metaModel2, searchSpace, popModel, tempSolutionSpace, TRANSFORMATION_DIR, "updateSearchSpace" ); 
			
			searchSpace = tempSolutionSpace;
			
			if(i>0)
				if(popCRA[i]>popCRA[gIndex])
					gIndex = i ; 
			
			System.out.println(popCRA[gIndex]);
	    }
	   
	    System.out.println("Iteration Phase:");
	    
	    for(int it=0; it<iteration_count ; it++){
	    	System.out.println("\niter = " + it);

		    for(int i=0; i<population_size; i++){	
		            
		            double CRAIndex = popCRA[i];
		    		Model rouletteWheel = EmftvmFactory.eINSTANCE.createModel();
		    		rouletteWheel.setResource(rs.createResource(URI.createURI("src/ir/ui/se/mdserg/ACOwithATL/Models/4RoleteWheel" + i + ".xmi")));
		    		transformation3(metaModel2, metaModel2, metaModel3, population.get(i), searchSpace, rouletteWheel, TRANSFORMATION_DIR, "createRoleteWheel");

		    		Model antSolution = EmftvmFactory.eINSTANCE.createModel();
		    		antSolution.setResource(rs.createResource(URI.createURI("src/ir/ui/se/mdserg/ACOwithATL/Models/antSolution" + i + ".xmi")));
		    		updatePopulationTransformation(metaModel3, metaModel2, metaModel2, rouletteWheel, population.get(i), antSolution, TRANSFORMATION_DIR, "runAnts");
		    		
		    		CRAIndex = CRAIndexCalculator.evaluateModel(antSolution.getResource());
		    		
		    		if(CRAIndex > popCRA[i]) { 
		    			for (EObject f : antSolution.getResource().getContents()) {
		    				double newTau = (1 - rho) * (((Feature) f).getTau() + (Q * CRAIndex));
		    				((Feature) f).setTau(newTau);
		    				((Feature) f).setEta(CRAIndex);
		    				((Feature) f).setNumeratorP((((Feature) f).getTau() * alpha) + (((Feature) f).getEta() * beta));
		    			}
		    			popCRA[i] = CRAIndex;		
		    			population.set(i, antSolution);
					
		    			Model updatedSolutionSpace = EmftvmFactory.eINSTANCE.createModel();
		    			updatedSolutionSpace.setResource(rs.createResource(URI.createURI("src/ir/ui/se/mdserg/ACOwithATL/Models/6updatedSolutionSpace.xmi")));
		    			transformation5(metaModel2, metaModel2, metaModel2, searchSpace, antSolution, updatedSolutionSpace, TRANSFORMATION_DIR, "updateSearchSpace" );
					
		    			searchSpace = updatedSolutionSpace;
		    		}
		    		else
		    			antSolution = population.get(i);
		    			
		             if (solutions.isEmpty() || popCRA[i] > ( (Feature) solutions.get(solutions.size() - 1).getResource().getContents().get(0)).getEta()  ) 
		             {
		               solutions.add(antSolution);
		               System.out.println("found a better solution with an objective of {}. "+ popCRA[i]); 
		               gIndex = i;
		               
		       			long endTime = System.currentTimeMillis();
		       			long totalTime = endTime - startTime;
		       			System.out.println("Total time = " + totalTime/1000.0 + " s");
		             }
		    	}    
		    }	
	    
	    if (solutions.size() > 0) {
	    	Model lastSolution = solutions.get(solutions.size() - 1);
	        
		    //Find best solution in population and save it as outModel 
			Model outModel = EmftvmFactory.eINSTANCE.createModel();
		    outModel.setResource(lastSolution.getResource()) ;   
		    
		    try {
				outModel.getResource().save(Collections.emptyMap());
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	      } else {
	        System.out.println("Found no solution!");
	      }

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total time = " + totalTime/1000.0 + " s");
		System.out.println("Best CRA Index is = " + popCRA[gIndex]) ; 
		System.out.println("Finished ..."); 
	}
	
	public static void generationTransformation(Metamodel metaModel1, Metamodel metaModel2, Model inModel, Model outModel1,String transformationDir, String transformationModule){
		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		env.setJitDisabled(true);

		env.registerMetaModel("architectureCRA", metaModel1); 
		env.registerMetaModel("pathCRA", metaModel2);
		env.registerInputModel("IN", inModel);
		env.registerOutputModel("OUT", outModel1);

		ModuleResolver mr = new DefaultModuleResolver(transformationDir, new ResourceSetImpl());
		TimingData td = new TimingData();
		env.loadModule(mr, transformationModule);
		td.finishLoading();
		env.run(td);
		td.finish();	
	}
	
	public static void transformation1(Metamodel metaModel1, Metamodel metaModel2, Model inModel1, Model outModel1, String transformationDir, String transformationModule){
		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		env.setJitDisabled(true);
 
		env.registerMetaModel("architectureCRA", metaModel1);
		env.registerMetaModel("architectureCRA1", metaModel2);
		env.registerInputModel("IN", inModel1);
		env.registerOutputModel("OUT", outModel1);

		ModuleResolver mr = new DefaultModuleResolver(transformationDir, new ResourceSetImpl());
		TimingData td = new TimingData();
		env.loadModule(mr, transformationModule);
		td.finishLoading();
		env.run(td);
		td.finish();
	}
	
	public static void transformation2(Metamodel metaModel1, Metamodel metaModel2, Metamodel metaModel3, Model inModel1, Model inModel2, Model outModel1, String transformationDir, String transformationModule){
		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		env.setJitDisabled(true);
 
		env.registerMetaModel("pathCRA", metaModel1);
		env.registerMetaModel("pathCRA", metaModel2);
		env.registerMetaModel("pathCRA", metaModel3);
		env.registerInputModel("IN1", inModel1);
		env.registerInputModel("IN2", inModel2);
		env.registerOutputModel("OUT", outModel1);

		ModuleResolver mr = new DefaultModuleResolver(transformationDir, new ResourceSetImpl());
		TimingData td = new TimingData();
		env.loadModule(mr, transformationModule);
		td.finishLoading();
		env.run(td);
		td.finish();
	}	
	
	public static void transformation5(Metamodel metaModel1, Metamodel metaModel2, Metamodel metaModel3, Model inModel1,  Model inModel2, Model outModel1, String transformationDir, String transformationModule){
		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		env.setJitDisabled(true);
		
		env.registerMetaModel("pathCRA", metaModel1);
		env.registerMetaModel("pathCRA", metaModel2);
		env.registerMetaModel("pathCRA", metaModel3);
		env.registerInputModel("IN1", inModel1);
		env.registerInputModel("IN2", inModel2);
		env.registerOutputModel("OUT", outModel1);

		ModuleResolver mr = new DefaultModuleResolver(transformationDir, new ResourceSetImpl());
		TimingData td = new TimingData();
		env.loadModule(mr, transformationModule);
		td.finishLoading();
		env.run(td);
		td.finish();
	}
	
	public static void transformation3(Metamodel metaModel1, Metamodel metaModel2, Metamodel metaModel3, Model inModel1,
			Model inModel2, Model outModel1, String transformationDir, String transformationModule) {
		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		env.setJitDisabled(true);

		env.registerMetaModel("pathCRA1", metaModel1);
		env.registerMetaModel("pathCRA2", metaModel2);
		env.registerMetaModel("RoleteWheel", metaModel3);
		env.registerInputModel("IN1", inModel1);
		env.registerInputModel("IN2", inModel2);
		env.registerOutputModel("OUT", outModel1);

		ModuleResolver mr = new DefaultModuleResolver(transformationDir, new ResourceSetImpl());
		TimingData td = new TimingData();
		env.loadModule(mr, transformationModule);
		td.finishLoading();
		env.run(td);
		td.finish();
	}

	public static void updatePopulationTransformation(Metamodel metaModel1, Metamodel metaModel2, Metamodel metaModel3, Model inModel1, 
			Model inModel2, Model outModel1, String transformationDir, String transformationModule) {
		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		env.setJitDisabled(true);

		env.registerMetaModel("RoleteWheel", metaModel1);
		env.registerMetaModel("pathCRA1", metaModel2);
		env.registerMetaModel("pathCRA", metaModel3);
		env.registerInputModel("IN", inModel1);
		env.registerInputModel("IN1", inModel2);
		env.registerOutputModel("OUT", outModel1);

		ModuleResolver mr = new DefaultModuleResolver(transformationDir, new ResourceSetImpl());
		TimingData td = new TimingData();
		env.loadModule(mr, transformationModule);
		td.finishLoading();
		env.run(td);
		td.finish();
	}

}


