package it.polimi.demo;

import java.util.List;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Execution started...");
		
		System.out.println("Input price "+500);
		FactoryWrapper.getInputPriceInterface().inputPrice(500);
		
		System.out.println("Photo acquisition");
		FactoryWrapper.getPhotoAcquisitionInterface().getPhoto();
		
		System.out.println("Recognition");
		FactoryWrapper.getRecognitionInterface().recognize();
		
		System.out.println("Product look up con barcode: AFG");
		FactoryWrapper.getProductLookupInterface().lookUp("AFG");
		
		System.out.println("Location");
		FactoryWrapper.getLocationInterface().getLocation();
		
		System.out.println("LocalSearch");
		List<String> result;
		result=FactoryWrapper.getLocalSearchInterface().localSearch("prodotto");
		for(int i=0;i< result.size();i++){
			System.out.println("Risultato local search "+i+" "+result.get(i));
		}
		
		System.out.println("Web search");
		result=FactoryWrapper.getWebSearchInterface().webSearch("prodotto");
		for(int i=0;i< result.size();i++){
			System.out.println("Risultato web search "+i+" "+result.get(i));
		}
		
		System.out.println("Secondary web search");
		FactoryWrapper.getSecondaryWebSearchInterface().secondaryWebSearch();
		
		System.out.println("Result ordering");
		result=FactoryWrapper.getResultOrderingInterface().ordering(result);
		if(result!=null)
		{
			for(int i=0;i< result.size();i++){
				System.out.println("Risultato ordinamento "+i+" "+result.get(i));
			}
		}		
		
		System.out.println("Publish price");
		FactoryWrapper.getPublishPriceInterface().publish("prodotto", 500);
		System.out.print("Execution terminated...");
	}

}
