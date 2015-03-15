package it.polimi.demo;

import it.polimi.demo.DemoWebMainSEI;
import it.polimi.demo.DemoWebMainService;

import java.net.URL;

import javax.xml.namespace.QName;

public class ProductLookup implements ProductLookupInterface {
	@Override
	public void lookUp(String barcode) {
		QName SERVICE_NAME = new QName("http://demo.polimi.it/", "DemoWebMainService");
		URL wsdlURL = DemoWebMainService.WSDL_LOCATION;
             
		DemoWebMainService ss = new DemoWebMainService(wsdlURL, SERVICE_NAME);
		DemoWebMainSEI port = ss.getDemoWebMainPort();            
     
        System.out.println("Invoking product look up...");
        long time = System.currentTimeMillis();
        port.productLookup(barcode);
        System.out.println("Delta: " + (System.currentTimeMillis() - time) +" ms");
	}

}