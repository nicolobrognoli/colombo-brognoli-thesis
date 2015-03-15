package it.polimi.prova;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService(targetNamespace = "http://prova.polimi.it/", endpointInterface = "it.polimi.prova.TestWebServiceSEI", portName = "TestWebServicePort", serviceName = "TestWebServiceService")
public class TestWebService implements TestWebServiceSEI{
	private int INPUTPRICE=3000;//Stato 0
	private int PHOTOACQUISITION=2000;//Stato 1
	private int LOCALRECOGNITION=10000;//Stato 2
	private int REMOTERECOGNITION=2000;//Stato 3
	private int PRODUCTLOOKUP=2000;//Stato 4
	private int LOCATION=6000;//Stato 5
	private int LOCALSEARCH=10000;//Stato 6
	private int WEBSEARCH=1000;//Stato 7
	private int SECONDARYWEBSEARCH=2;//Stato 8
	private int RESULTORDERING=1000;//Stato 9
	private int PUBLISHPRIZE=1;//Stato 10

	public void inputPrice(int price){
		try {
			long start = System.currentTimeMillis();
			Thread.sleep(INPUTPRICE);
			System.out.println("Input price "+price+":Sleeped for: " + (System.currentTimeMillis() - INPUTPRICE) +" ms");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void getPhoto(){
		try {
			long start = System.currentTimeMillis();
			Thread.sleep(PHOTOACQUISITION);
			System.out.println("Photo acquisition :Sleeped for: " + (System.currentTimeMillis() - PHOTOACQUISITION) +" ms");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void localRecognition(){
		try {
			long start = System.currentTimeMillis();
			Thread.sleep(LOCALRECOGNITION);
			System.out.println("Local recognition:Sleeped for: " + (System.currentTimeMillis() - LOCALRECOGNITION) +" ms");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void remoteRecognition(){
		try {
			long start = System.currentTimeMillis();
			Thread.sleep(REMOTERECOGNITION);
			System.out.println("Remote recognition :Sleeped for: " + (System.currentTimeMillis() - REMOTERECOGNITION) +" ms");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void productLookup(String barcode){
		try {
			long start = System.currentTimeMillis();
			Thread.sleep(PRODUCTLOOKUP);
			System.out.println("Product lookup "+barcode+":Sleeped for: " + (System.currentTimeMillis() - PRODUCTLOOKUP) +" ms");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void getLocation(){
		try {
			long start = System.currentTimeMillis();
			Thread.sleep(LOCATION);
			System.out.println("Location :Sleeped for: " + (System.currentTimeMillis() - LOCATION) +" ms");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public List<String> localSearch(String product){
		List<String> result=new ArrayList<String>();
		try {
			long start = System.currentTimeMillis();
			Thread.sleep(LOCALSEARCH);
			System.out.println("Local search "+product+":Sleeped for: " + (System.currentTimeMillis() - LOCALSEARCH) +" ms");
			result.add("Coop");
			result.add("Bennet");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return result;
	}
	

	public List<String> webSearch(String product){
		List<String> results=new ArrayList<String>();
		try {
			long start = System.currentTimeMillis();
			Thread.sleep(WEBSEARCH);
			System.out.println("Web search "+product+" :Sleeped for: " + (System.currentTimeMillis() - WEBSEARCH) +" ms");
			results.add("web result 1");
			results.add("web result 2");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		return results;
	}

	public void secondaryWebSearch(){
		try {
			long start = System.currentTimeMillis();
			Thread.sleep(SECONDARYWEBSEARCH);
			System.out.println("Secondary web search  :Sleeped for: " + (System.currentTimeMillis() - SECONDARYWEBSEARCH) +" ms");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}

	public void resultOrdering(List<String> results){
		try {
			String temp;
			List<String> tempList=new ArrayList<String>();
			long start = System.currentTimeMillis();
			Thread.sleep(RESULTORDERING);
			System.out.println("Result ordering :Sleeped for: " + (System.currentTimeMillis() - RESULTORDERING) +" ms");
			for(int i=0;i<results.size();i++){
				temp=results.remove(i);
				if(!tempList.contains(temp)){
					tempList.add(temp);
					int j;
					for(j=0;j<results.size()&&temp.compareTo(results.get(j))<0;j++){
					}
					tempList.add(j, temp);
				}
			}
			results=tempList;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void publishPrize(String product,float prize){
		try {
			long start = System.currentTimeMillis();
			Thread.sleep(PUBLISHPRIZE);
			System.out.println("Publish prize "+product+" "+prize+" :Sleeped for: " + (System.currentTimeMillis() - PUBLISHPRIZE) +" ms");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

	
}
