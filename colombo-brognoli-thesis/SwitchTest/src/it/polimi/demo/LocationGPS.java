package it.polimi.demo;

import it.polimi.demo.DemoWebMainSEI;
import it.polimi.demo.DemoWebMainService;

import java.net.URL;

import javax.xml.namespace.QName;

public class LocationGPS implements LocationInterface {
	@Override
	public void getLocation() {
		QName SERVICE_NAME = new QName("http://demo.polimi.it/", "DemoWebMainService");
		URL wsdlURL = DemoWebMainService.WSDL_LOCATION;
             
		DemoWebMainService ss = new DemoWebMainService(wsdlURL, SERVICE_NAME);
		DemoWebMainSEI port = ss.getDemoWebMainPort();           
     
        System.out.println("[INFO] Invoking location GPS...");
        long time = System.currentTimeMillis();
        port.getLocationGPS();
        System.out.println("[INFO] Delta: " + (System.currentTimeMillis() - time) +" ms");
	}

}