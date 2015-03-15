package it.polimi.demo;

import it.polimi.demo.DemoWebMainSEI;
import it.polimi.demo.DemoWebMainService;

import java.net.URL;

import javax.xml.namespace.QName;

public class LocalRecognition implements RecognitionInterface {
	@Override
	public void recognize() {
		QName SERVICE_NAME = new QName("http://demo.polimi.it/", "DemoWebMainService");
		URL wsdlURL = DemoWebMainService.WSDL_LOCATION;
             
        DemoWebMainService ss = new DemoWebMainService(wsdlURL, SERVICE_NAME);
        DemoWebMainSEI port = ss.getDemoWebMainPort();              
     
        System.out.println("Invoking local recognition...");
        long time = System.currentTimeMillis();
        port.localRecognition();
        System.out.println("Delta: " + (System.currentTimeMillis() - time) +" ms");
	}
}