package ir.ui.se.mdserg.PSOwithATL;

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

	final static String TRANSFORMATION_DIR = "src/ir/ui/se/mdserg/PSOwithATL/Transformations/";
	final static int iteration_count = 100000; 
	final static int population_size = 10; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("PSO Started ...") ; 	
		long startTime = System.currentTimeMillis();
		
		CRAIndexCalculator.architectureRegisterPackage(); 
		CRAIndexCalculator.particleRegisterPackage();
		CRAIndexCalculator.vectorRegisterPackage();
		
		ResourceSet rs = new ResourceSetImpl();			
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("emftvm", new EMFTVMResourceFactoryImpl());

		Metamodel metaModel1 = EmftvmFactory.eINSTANCE.createMetamodel();
		metaModel1.setResource(rs.getResource(URI.createURI("http://momot.big.tuwien.ac.at/architectureCRA/1.0"), true));

		Metamodel metaModel2 = EmftvmFactory.eINSTANCE.createMetamodel();
		metaModel2.setResource(rs.getResource(URI.createURI("http://www.particleCRA.com"), true));

		Metamodel metaModel3 = EmftvmFactory.eINSTANCE.createMetamodel();
		metaModel3.setResource(rs.getResource(URI.createURI("http://www.velocity.com"), true));
			
		Model inModel = EmftvmFactory.eINSTANCE.createModel();
		inModel.setResource(rs.getResource(URI.createURI("src/ir/ui/se/mdserg/PSOwithATL/Models/a.xmi", true), true));

		
		//Population and Velocity generation for PSO Algorithm 
		ArrayList<Model> population = new ArrayList<Model>();
		ArrayList<Model> velocity = new ArrayList<Model>();
		ArrayList<Model> pBest = new ArrayList<Model>() ;
		Model gBest = EmftvmFactory.eINSTANCE.createModel();
		
        double[] popCRA = new double[population_size];
        double[] pBestCRA = new double[population_size];
        
        int gIndex = 0 ;
	    for (int i = 0; i < population_size; i++) {
			Model popModel = EmftvmFactory.eINSTANCE.createModel();
			popModel.setResource(rs.createResource(URI.createURI("src/ir/ui/se/mdserg/PSOwithATL/Models/popModel"+ i +".xmi")));
			Model vModel = EmftvmFactory.eINSTANCE.createModel();
			vModel.setResource(rs.createResource(URI.createURI("src/ir/ui/se/mdserg/PSOwithATL/Models/vModel"+ i +".xmi")));
			
			generationTransformation(metaModel1, metaModel2, inModel, popModel, TRANSFORMATION_DIR, "class2particle" ); 
			vectorGenerationTransformation(metaModel2, metaModel3, popModel, vModel, TRANSFORMATION_DIR, "randomvector" );
			population.add(popModel) ;
			pBest.add(popModel) ;
            velocity.add(vModel) ;
			popCRA[i] = CRAIndexCalculator.evaluateModel(popModel.getResource()) ; 
			pBestCRA[i] = popCRA[i] ; 
			
			if(i>0)
				if(popCRA[i]>popCRA[gIndex])
					gIndex = i ; 
	    }
	    
	    
	    //PSO Iteration Phase
	    for(int it=0; it<iteration_count ; it++){
	    	System.out.println("\niter = " + it);
		 
	    	// Calculate gBest 
		    gBest = population.get(gIndex) ;
		    
		    System.out.println("CRA Index: " + popCRA[gIndex]);
			long endTime = System.currentTimeMillis();
			long totalTime = endTime - startTime;
			System.out.println("Total time = " + totalTime/1000.0 + " s");
		    
	        double[] crossPopCRA = new double[population_size];
	        
		    for(int i=0; i<population_size; i++){	
		    	
		    	if(i==gIndex) continue;
			
		    	// Compute Velocity for gBest-Xi(t-1)
				Model vgBestModel = EmftvmFactory.eINSTANCE.createModel();
				vgBestModel.setResource(rs.createResource(URI.createURI("src/ir/ui/se/mdserg/PSOwithATL/Models/vgBestModel.xmi")));
				computeVelocityTransformation(metaModel2, metaModel3, population.get(i), gBest, vgBestModel, TRANSFORMATION_DIR, "computeVelocity");

				// Compute Velocity for pBesti-Xi(t-1)
				Model vpBestModel = EmftvmFactory.eINSTANCE.createModel();
				vpBestModel.setResource(rs.createResource(URI.createURI("src/ir/ui/se/mdserg/PSOwithATL/Models/vpBestModel"+ i +".xmi")));
				computeVelocityTransformation(metaModel2, metaModel3, population.get(i), pBest.get(i), vpBestModel, TRANSFORMATION_DIR, "computeVelocity");
			
				// Calculate final Velocity according to the Update velocity Formula by two transformations 
				Model tempVModel = EmftvmFactory.eINSTANCE.createModel();
				tempVModel.setResource(rs.createResource(URI.createURI("src/ir/ui/se/mdserg/PSOwithATL/Models/tempVModel"+ i +".xmi")));
				updateVelocityTransformation(metaModel3, vpBestModel, vgBestModel, tempVModel, TRANSFORMATION_DIR, "UpdateVector") ; 
				
				Model finalVModel = EmftvmFactory.eINSTANCE.createModel();
				finalVModel.setResource(rs.createResource(URI.createURI("src/ir/ui/se/mdserg/PSOwithATL/Models/finalVModel"+ i +".xmi")));
				updateVelocityTransformation(metaModel3, velocity.get(i), tempVModel, finalVModel, TRANSFORMATION_DIR, "UpdateVector");

				// Update X according to X(t) = X(t-1) + V(t) that V(t) is finalVModel
				Model tempXModel = EmftvmFactory.eINSTANCE.createModel();
				tempXModel.setResource(rs.createResource(URI.createURI("src/ir/ui/se/mdserg/PSOwithATL/Models/tempX"+ i +".xmi")));
				updatePopulationTransformation(metaModel2, metaModel3, population.get(i), finalVModel, tempXModel, TRANSFORMATION_DIR, "UpdateParticle") ;
				
				// Set pBest i for next iteration 
				crossPopCRA[i] = CRAIndexCalculator.evaluateModel(tempXModel.getResource()) ; 
				if(crossPopCRA[i]>pBestCRA[i]){
					pBestCRA[i] = crossPopCRA[i] ; 
					pBest.set(i, tempXModel) ;  
				}
				
			  	// Compute Velocity for next iteration
				Model vModel = EmftvmFactory.eINSTANCE.createModel();
				vModel.setResource(rs.createResource(URI.createURI("src/ir/ui/se/mdserg/PSOwithATL/Models/vModel"+ i +".xmi")));
				vectorGenerationTransformation(metaModel2, metaModel3, population.get(i), vModel, TRANSFORMATION_DIR, "randomvector" );
				velocity.set(i, vModel) ; 
				
				population.set(i, tempXModel) ;
				popCRA[i] = crossPopCRA[i] ; 
				
				if(i>0)
					if(popCRA[i]>popCRA[gIndex])
						gIndex = i ;
		    }
	    }	
	    
	    //Find best solution in population and save it as outModel 
		Model outModel = EmftvmFactory.eINSTANCE.createModel();
		outModel.setResource(rs.createResource(URI.createURI("src/ir/ui/se/mdserg/PSOwithATL/Models/ouput.xmi")));
	    outModel.setResource(population.get(gIndex).getResource()) ;   
		try {
			outModel.getResource().save(Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total time= " + totalTime/1000.0 + " s");
		System.out.println("Best CRA Index is = " + popCRA[gIndex]) ; 
		System.out.println("Finished ..."); 
	}

	public static void generationTransformation(Metamodel metaModel1, Metamodel metaModel2, Model inModel, Model outModel1,String transformationDir, String transformationModule){
		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		env.setJitDisabled(true);

		env.registerMetaModel("architectureCRA", metaModel1); 
		env.registerMetaModel("particleCRA", metaModel2);
		env.registerInputModel("IN", inModel);
		env.registerOutputModel("OUT", outModel1);

		ModuleResolver mr = new DefaultModuleResolver(transformationDir, new ResourceSetImpl());
		TimingData td = new TimingData();
		env.loadModule(mr, transformationModule);
		td.finishLoading();
		env.run(td);
		td.finish();	
	}
	
	public static void vectorGenerationTransformation(Metamodel metaModel1, Metamodel metaModel2, Model inModel, Model outModel1,String transformationDir, String transformationModule){
		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		env.setJitDisabled(true);

		
		env.registerMetaModel("particleCRA", metaModel1);
		env.registerMetaModel("velocityVector", metaModel2);
		env.registerInputModel("IN", inModel);
		env.registerOutputModel("OUT1", outModel1);

		ModuleResolver mr = new DefaultModuleResolver(transformationDir, new ResourceSetImpl());
		TimingData td = new TimingData();
		env.loadModule(mr, transformationModule);
		td.finishLoading();
		env.run(td);
		td.finish();	
	}

	public static void computeVelocityTransformation(Metamodel metaModel1, Metamodel metaModel2, Model inModel1, Model inModel2 ,Model outModel1, String transformationDir, String transformationModule){
		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		env.setJitDisabled(true);

		env.registerMetaModel("particleCRA", metaModel1);
		env.registerMetaModel("velocityVector", metaModel2);
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
	
	public static void updateVelocityTransformation(Metamodel metaModel1, Model inModel1, Model inModel2, Model outModel1, String transformationDir, String transformationModule){
		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		env.setJitDisabled(true);

		env.registerMetaModel("velocityVector", metaModel1);
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
	
	public static void updatePopulationTransformation(Metamodel metaModel1, Metamodel metaModel2, Model inModel1, Model inModel2, Model outModel1, String transformationDir, String transformationModule){
		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		env.setJitDisabled(true);
 
		env.registerMetaModel("particleCRA", metaModel1);
		env.registerMetaModel("velocityVector", metaModel2);
		env.registerInputModel("IN1", inModel1);
		env.registerInOutModel("IN2", inModel2);
		env.registerOutputModel("OUT", outModel1);

		ModuleResolver mr = new DefaultModuleResolver(transformationDir, new ResourceSetImpl());
		TimingData td = new TimingData();
		env.loadModule(mr, transformationModule);
		td.finishLoading();
		env.run(td);
		td.finish();
	}
	
}

