package it.polimi.demo;

import it.polimi.demo.DemoWebMainSEI;
import it.polimi.demo.DemoWebMainService;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

public class WebSearch implements WebSearchInterface {
	@Override
	public List<String> webSearch(String product) {
		List<String> results=new ArrayList<String>();
		QName SERVICE_NAME = new QName("http://demo.polimi.it/", "DemoWebMainService");
		URL wsdlURL = DemoWebMainService.WSDL_LOCATION;
             
		DemoWebMainService ss = new DemoWebMainService(wsdlURL, SERVICE_NAME);
		DemoWebMainSEI port = ss.getDemoWebMainPort();           
     
        System.out.println("Invoking web search..."+"Prodotto: "+product);
        long time = System.currentTimeMillis();
        results=port.webSearch(product);
        for(int i=0;i<results.size();i++){
        	System.out.println("Risultato "+i+" "+results.get(i));
        }
        System.out.println("Delta: " + (System.currentTimeMillis() - time) +" ms");
        return results;
	}

}