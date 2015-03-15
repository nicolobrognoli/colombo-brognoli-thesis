package it.polimi.demo;

import it.polimi.demo.DemoWebMainSEI;
import it.polimi.demo.DemoWebMainService;

import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

public class ResultOrdering implements ResultOrderingInterface {
	@Override
	public List<String> ordering(List<String> results) {
		List<String> result=null;
		QName SERVICE_NAME = new QName("http://demo.polimi.it/", "DemoWebMainService");
		URL wsdlURL = DemoWebMainService.WSDL_LOCATION;
             
		DemoWebMainService ss = new DemoWebMainService(wsdlURL, SERVICE_NAME);
		DemoWebMainSEI port = ss.getDemoWebMainPort();            
     
        System.out.println("Invoking result ordering...");
        long time = System.currentTimeMillis();
        result=port.resultOrdering(results);
        for(int i=0;i<results.size();i++){
        	System.out.println("Risultato "+i+" "+results.get(i));
        }
        System.out.println("Delta: " + (System.currentTimeMillis() - time) +" ms");
        return result;
	}

}