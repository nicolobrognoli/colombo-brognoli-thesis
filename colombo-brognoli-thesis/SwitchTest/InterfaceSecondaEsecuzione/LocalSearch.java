package it.polimi.demo;

import it.polimi.demo.DemoWebMainSEI;
import it.polimi.demo.DemoWebMainService;

import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

public class LocalSearch implements LocalSearchInterface {
	@Override
	public List<String> localSearch(String product) {
		List<String> result;
		QName SERVICE_NAME = new QName("http://demo.polimi.it/", "DemoWebMainService");
		URL wsdlURL = DemoWebMainService.WSDL_LOCATION;
             
		DemoWebMainService ss = new DemoWebMainService(wsdlURL, SERVICE_NAME);
		DemoWebMainSEI port = ss.getDemoWebMainPort();            
     
        System.out.println("Invoking local search...");
        long time = System.currentTimeMillis();
        result=port.localSearch(product);
        for(int i=0;i<result.size();i++){
        	System.out.println("Risultato numero "+i+" "+result.get(i));
        }
        System.out.println("Delta: " + (System.currentTimeMillis() - time) +" ms");
        return result;
	}
}