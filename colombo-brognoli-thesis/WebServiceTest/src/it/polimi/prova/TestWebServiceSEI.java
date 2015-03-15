package it.polimi.prova;

import java.util.List;

import javax.jws.WebService;

@WebService(name = "TestWebServiceSEI", targetNamespace = "http://prova.polimi.it/")
public interface TestWebServiceSEI {

	public void inputPrice(int price);

	public void getPhoto();

	public void localRecognition();

	public void remoteRecognition();

	public void productLookup(String barcode);

	public void getLocation();

	public List<String> localSearch(String product);

	public List<String> webSearch(String product);

	public void secondaryWebSearch();

	public void resultOrdering(List<String> results);

	public void publishPrize(String product, float prize);

}