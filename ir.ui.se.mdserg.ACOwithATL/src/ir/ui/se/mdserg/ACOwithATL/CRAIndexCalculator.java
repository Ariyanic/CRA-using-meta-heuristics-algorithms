package ir.ui.se.mdserg.ACOwithATL;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import Path.PathPackage;
import RoleteWheel.RoleteWheelPackage;
import architectureCRA.ArchitectureCRAPackage;
import Path.*;

public class CRAIndexCalculator {
	public static void architectureRegisterPackage() {
		ArchitectureCRAPackage.eINSTANCE.eClass();
	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("xmi", new XMIResourceFactoryImpl());
	}

	public static void pathRegisterPackage() {
		PathPackage.eINSTANCE.eClass();    
	    Resource.Factory.Registry regChrom = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> mCh = regChrom.getExtensionToFactoryMap();
	    mCh.put("xmi", new XMIResourceFactoryImpl());
	}
	
	public static void rouletteWheelRegisterPackage() {
		RoleteWheelPackage.eINSTANCE.eClass();    
	    Resource.Factory.Registry regRW = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> mRW = regRW.getExtensionToFactoryMap();
	    mRW.put("xmi", new XMIResourceFactoryImpl());
	}
	
	public static Resource loadModel(String model) {
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI(model), true);
		if(resource == null) {
			System.err.println("Model can not be loaded!");
			return null;
		}
		return resource ; 
	}
	
	static double calculateCohesion(List<ModelClass> AllClasses){
		double cohesionRatio = 0.0 ; 
		for(ModelClass clazz : AllClasses) {
			if(clazz.methods.size()==0){
				cohesionRatio +=0.0;
			} else if (clazz.methods.size()==1){ //Here, the second part of the addition is still 0
				if (clazz.attributes.size()==0){ //and now, also the first part is 0
					cohesionRatio += 0.0;
				} else { //now, the first part is not 0
					cohesionRatio += mai(clazz,clazz)/(double)(clazz.methods.size()*clazz.attributes.size());
				}
			} else { //Here, we have more than one method in the clazz
				if (clazz.attributes.size()==0){ //Now, the first part of the addition will be 0
					cohesionRatio += mmi(clazz,clazz)/(double)(clazz.methods.size()*(clazz.methods.size()-1));
				} else { //Here, we have more than 0 attributes and more than 1 method, so we use the whole formula
					cohesionRatio += mai(clazz,clazz)/(double)(clazz.methods.size()*clazz.attributes.size()) +
							mmi(clazz,clazz)/(double)(clazz.methods.size()*(clazz.methods.size()-1));
				}
			}
		}
		return cohesionRatio;
	}
	
	static double calculateCRAIndex(List<ModelClass> AllClasses) {
		return calculateCohesion(AllClasses) - calculateCoupling(AllClasses);
	}
	
	static double calculateCoupling(List<ModelClass> AllClasses) {
		double couplingRatio = 0;
		for (ModelClass clazz : AllClasses) 
			couplingRatio += calculateCoupling(clazz, AllClasses);
		return couplingRatio;
	}
	
	static double calculateCoupling(ModelClass classSource, List<ModelClass> AllClasses) {
		double couplingRatio = 0;
		for(ModelClass classTarget : AllClasses) {
			if (classSource.name != classTarget.name){
				if (classSource.methods.size()==0){
					couplingRatio += 0.0;
				} else { //From here, |M(clsi)|>0
					if (classTarget.methods.size()<=1){ //The second part of the addition is 0
						if (classTarget.attributes.size()==0){ //Now, also the first part of the addition is 0
							couplingRatio += 0.0;
						} else { //Now, the first part of the addition is not 0
							couplingRatio += mai(classSource,classTarget)/(double)(classSource.methods.size()*classTarget.attributes.size());
						}
					} else{ //Now, the second part of the addition is not 0
						if (classTarget.attributes.size()==0){
							couplingRatio += mmi(classSource,classTarget)/(double)(classSource.methods.size()*(classTarget.methods.size()-1));
						} else { //Now, non of the parts is 0
							couplingRatio += (mai(classSource,classTarget)/(double)(classSource.methods.size()*classTarget.attributes.size()))+
								 	(mmi(classSource,classTarget)/(double)(classSource.methods.size()*(classTarget.methods.size()-1)));
						}
					}
				}
			}
		}
		return couplingRatio;
	}

	static int mai(ModelClass classSource, ModelClass classTarget){
		int mai = 0 ; 
		for (Method method : classSource.methods) {
			for (Attribute attribute : classTarget.attributes) {
				if (method.getDataDependency().contains(attribute))
					mai++;
			}
		}
		return mai ; 
	}
	
	static int mmi(ModelClass classSource, ModelClass classTarget){
		int mmi = 0;
		for (Method methodSource : classSource.methods){
			for (Method methodTarget : classTarget.methods){
				if (methodSource.getFunctionalDependency().contains(methodTarget))
					mmi++;
			}
		}		
		return mmi;
	}
	
	public static double evaluateModel(Resource model) {
		List<ModelClass> AllClasses = new ArrayList<ModelClass>() ; 
		AllModelClassInfo(model, AllClasses) ;
		double CRAIndex = calculateCRAIndex(AllClasses) ;
		return CRAIndex ; 
	}
		
	public static void AllModelClassInfo(Resource resource, List<ModelClass> AllClasses){
		for(EObject f : resource.getContents()) {
	    	boolean check = true ; 
	    	if(f instanceof Method){
	    		for(int i=0; i<AllClasses.size(); i++){
	    			if(AllClasses.get(i).name.equals(((Method) f).getClassname())){
	    				AllClasses.get(i).methods.add((Method)f);
	    				check = false ; 
	    				break ; 
	    			}
	    		}
	    		if(check){
	    			ModelClass mc = new ModelClass(((Method) f).getClassname()) ; 
	    			mc.methods.add((Method)f) ; 
	    			AllClasses.add(mc) ; 
	    		}
	    	}else if(f instanceof Attribute){
	    		for(int i=0; i<AllClasses.size(); i++){
	    			if(AllClasses.get(i).name.equals( ((Attribute) f).getClassname())){
	    				AllClasses.get(i).attributes.add((Attribute)f);
	    				check = false ; 
	    				break ;
	    			}
	    		}
	    		if(check){
	    			ModelClass mc = new ModelClass(((Attribute) f).getClassname()) ; 
	    			mc.attributes.add((Attribute)f) ; 
	    			AllClasses.add(mc) ; 
	    		}
	    	}
	    }
	}
}

class ModelClass{
	public String name ; 
	public List<Method> methods ; 
	public List<Attribute> attributes ; 
	
	ModelClass(String className){
		name = className ; 
		methods = new ArrayList<Method>() ; 
		attributes = new ArrayList<Attribute>() ; 
	}
}