package it.polimi.demo;

import it.polimi.demo.DemoWebMainSEI;
import it.polimi.demo.DemoWebMainService;

import java.net.URL;

import javax.xml.namespace.QName;

public class PublishPrice implements PublishPriceInterface {
	@Override
	public void publish(String product, float prize) {
		QName SERVICE_NAME = new QName("http://demo.polimi.it/", "DemoWebMainService");
		URL wsdlURL = DemoWebMainService.WSDL_LOCATION;
             
		DemoWebMainService ss = new DemoWebMainService(wsdlURL, SERVICE_NAME);
		DemoWebMainSEI port = ss.getDemoWebMainPort();             
     
        System.out.println("Invoking publish prize...");
        long time = System.currentTimeMillis();
        port.publishPrize(product,prize);
        System.out.println("Delta: " + (System.currentTimeMillis() - time) +" ms");
	}

}