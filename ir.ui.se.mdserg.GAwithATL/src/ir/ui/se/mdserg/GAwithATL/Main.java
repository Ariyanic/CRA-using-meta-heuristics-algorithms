package ir.ui.se.mdserg.GAwithATL;

import java.util.ArrayList;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
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

public class Main {

	final static String TRANSFORMATION_DIR = "src/ir/ui/se/mdserg/GAwithATL/transformations/";
	final static int iteration_count = 100000 ; 
	final static int population_size = 10 ; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("GA Started ...") ; 	
		long startTime = System.currentTimeMillis();
		
		CRAIndexCalculator.architectureRegisterPackage(); 
		CRAIndexCalculator.chromosomeRegisterPackage();
		
		ResourceSet rs = new ResourceSetImpl();			
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("emftvm", new EMFTVMResourceFactoryImpl());

		Metamodel metaModel1 = EmftvmFactory.eINSTANCE.createMetamodel();
		metaModel1.setResource(rs.getResource(URI.createURI("http://momot.big.tuwien.ac.at/architectureCRA/1.0"), true));

		Metamodel metaModel2 = EmftvmFactory.eINSTANCE.createMetamodel();
		metaModel2.setResource(rs.getResource(URI.createURI("http://www.chromosomeCRA.com"), true));

		Model inModel = EmftvmFactory.eINSTANCE.createModel();
		inModel.setResource(rs.getResource(URI.createURI("src/ir/ui/se/mdserg/GAwithATL/Models/a.xmi", true), true));
		
		Model tempModel1 = EmftvmFactory.eINSTANCE.createModel();
		Model tempModel2 = EmftvmFactory.eINSTANCE.createModel();

		//Population generation for Genetic Algorithm 
		ArrayList<Model> population = new ArrayList<Model>();
	
        double[] popCRA = new double[2*population_size];
      
	    for (int i = 0; i < 2*population_size; i++) {
			Model popModel = EmftvmFactory.eINSTANCE.createModel();

			popModel.setResource(rs.createResource(URI.createURI("src/ir/ui/se/mdserg/GAwithATL/Models/popModel"+ i +".xmi")));
		
            transform1(metaModel1, metaModel2, inModel, popModel,TRANSFORMATION_DIR, "class2chromosome" ); 
            population.add(popModel);
   
            popCRA[i] = CRAIndexCalculator.evaluateModel(popModel.getResource()) ; 
	    }
	    
	    //GA Iteration Phase
	    for(int it=0; it<iteration_count ; it++){
	    	System.out.println("\niter = " + it);
	    	
		    ArrayList<Model> Crosspopulation = new ArrayList<>();
	        double[] crossPopCRA = new double[population_size];
	        
			MergeSort ob = new MergeSort(); 
			ob.sort(popCRA, population, 0, popCRA.length-1); 
	        	        
	        System.out.println("CRA Index: " + popCRA[0]);
			long endTime = System.currentTimeMillis();
			long totalTime = endTime - startTime;
			System.out.println("Total time = " + totalTime/1000.0 + " s");
	        
		    for (int i=0; i<population_size/2; i++){
				Model tempModel3 = EmftvmFactory.eINSTANCE.createModel();
				tempModel3.setResource(rs.createResource(URI.createURI("src/ir/ui/se/mdserg/GAwithATL/Models/temp"+ i +".xmi")));
				Model tempModel4 = EmftvmFactory.eINSTANCE.createModel();
				tempModel4.setResource(rs.createResource(URI.createURI("src/ir/ui/se/mdserg/GAwithATL/Models/temp"+ (population_size-i-1) +".xmi")));
		    	
		    	tempModel1 = population.get(i);
		    	tempModel2 = population.get(population_size-i-1);

		    	if (Math.random()<0.85){
		    		try{
		    			transform2(metaModel2, tempModel1, tempModel2, tempModel3, tempModel4, TRANSFORMATION_DIR, "CrossOver");
		    		}
		    		catch(Exception e){
		    			System.out.println(e.toString());
		    		}
					Model tempModel5 = EmftvmFactory.eINSTANCE.createModel();
					tempModel5.setResource(rs.createResource(URI.createURI("src/ir/ui/se/mdserg/GAwithATL/Models/cmPop"+ i +".xmi")));
					Model tempModel6 = EmftvmFactory.eINSTANCE.createModel();
					tempModel6.setResource(rs.createResource(URI.createURI("src/ir/ui/se/mdserg/GAwithATL/Models/cmPop"+ (population_size-i-1) +".xmi")));
			   
			    	transform3(metaModel2, tempModel3, tempModel5, TRANSFORMATION_DIR, "Mutation");
			    	tempModel3 = tempModel5 ; 
			  
			    	transform3(metaModel2, tempModel4, tempModel6, TRANSFORMATION_DIR, "Mutation");
			    	tempModel4 = tempModel6 ; 
		    	}
	    		Crosspopulation.add(tempModel3);
	    		crossPopCRA[2*i] = CRAIndexCalculator.evaluateModel(tempModel3.getResource()) ; 
		    	
	    		Crosspopulation.add(tempModel4);
	    		crossPopCRA[2*i+1] = CRAIndexCalculator.evaluateModel(tempModel4.getResource()) ; 
		    }
		 
		    for(int j=0; j<population_size; j++){
		    	population.set(population_size+j, Crosspopulation.get(j)) ; 
		    	popCRA[population_size+j] = crossPopCRA[j] ; 
		    }
		    
	    }	
		
	    //Find best solution in population and save it as outModel 
		Model outModel = EmftvmFactory.eINSTANCE.createModel();
		outModel.setResource(rs.createResource(URI.createURI("src/ir/ui/se/mdserg/GAwithATL/Models/ouput.xmi")));

		int index = 0 ; 
	    for(int i=1; i<population.size(); i++){
	    	//find best CRA-Index and set it as outModel
	    	if(popCRA[i]>popCRA[index])
	    		index = i ; 
	    }
	  
	    outModel.setResource(population.get(index).getResource()) ;   
		try {
			outModel.getResource().save(Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total time = " + totalTime/1000.0 + " s");
		System.out.println("Best CRA Index is = " + popCRA[index]) ; 
		System.out.println("Finished ..."); 
	}

	public static void transform1(Metamodel metaModel1, Metamodel metaModel2, Model inModel, Model outModel,String transformationDir, String transformationModule){
		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		env.setJitDisabled(true);

		env.registerMetaModel("architectureCRA", metaModel1); 
		env.registerMetaModel("chromosomeCRA", metaModel2);
		env.registerInputModel("IN", inModel);
		env.registerOutputModel("OUT", outModel);

		ModuleResolver mr = new DefaultModuleResolver(transformationDir, new ResourceSetImpl());
		TimingData td = new TimingData();
		env.loadModule(mr, transformationModule);
		td.finishLoading();
		env.run(td);
		td.finish();	
	}
	
	public static void transform2(Metamodel metaModel, Model inModel1, Model inModel2 ,Model outModel1,Model outModel2, String transformationDir, String transformationModule){
		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		env.setJitDisabled(true);

		env.registerMetaModel("chromosome", metaModel); 
		env.registerMetaModel("chromosome1", metaModel); 
		env.registerMetaModel("chromosome2", metaModel); 
		env.registerInputModel("IN1", inModel1);
		env.registerInputModel("IN2", inModel2);
		env.registerOutputModel("OUT1", outModel1);
		env.registerOutputModel("OUT2", outModel2);

		ModuleResolver mr = new DefaultModuleResolver(transformationDir, new ResourceSetImpl());
		TimingData td = new TimingData();
		env.loadModule(mr, transformationModule);		
		td.finishLoading();
		env.run(td);
		td.finish();	
	}
	
	public static void transform3(Metamodel metaModel, Model inModel, Model outModel, String transformationDir, String transformationModule){
		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		env.setJitDisabled(true);
		env.registerMetaModel("chromosome", metaModel); 
		env.registerInputModel("IN", inModel);
		env.registerOutputModel("OUT", outModel);

		ModuleResolver mr = new DefaultModuleResolver(transformationDir, new ResourceSetImpl());
		TimingData td = new TimingData();
		env.loadModule(mr, transformationModule);
		td.finishLoading();
		env.run(td);
		td.finish();	
	}
}
