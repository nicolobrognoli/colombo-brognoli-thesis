package it.polimi.demo;

import it.polimi.demo.DemoWebMainSEI;
import it.polimi.demo.DemoWebMainService;

import java.net.URL;

import javax.xml.namespace.QName;

public class SecondaryWebSearch implements SecondaryWebSearchInterface {
	@Override
	public void secondaryWebSearch() {
		QName SERVICE_NAME = new QName("http://demo.polimi.it/", "DemoWebMainService");
		URL wsdlURL = DemoWebMainService.WSDL_LOCATION;
             
		DemoWebMainService ss = new DemoWebMainService(wsdlURL, SERVICE_NAME);
		DemoWebMainSEI port = ss.getDemoWebMainPort();            
     
        System.out.println("Invoking secondary web search...");
        long time = System.currentTimeMillis();
        port.secondaryWebSearch();
        System.out.println("Delta: " + (System.currentTimeMillis() - time) +" ms");
	}

}