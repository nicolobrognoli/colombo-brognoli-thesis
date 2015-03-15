package it.polimi.demo;

import it.polimi.demo.DemoWebMainSEI;
import it.polimi.demo.DemoWebMainService;

import java.net.URL;

import javax.xml.namespace.QName;

public class InputPrice implements InputPriceInterface {
	@Override
	public void inputPrice(int price) {
		QName SERVICE_NAME = new QName("http://demo.polimi.it/", "DemoWebMainService");
		URL wsdlURL = DemoWebMainService.WSDL_LOCATION;
             
		DemoWebMainService ss = new DemoWebMainService(wsdlURL, SERVICE_NAME);
		DemoWebMainSEI port = ss.getDemoWebMainPort();          
     
        System.out.println("Invoking input price: "+price);
        long time = System.currentTimeMillis();
        port.inputPrice(price);
        System.out.println("Delta: " + (System.currentTimeMillis() - time) +" ms");
	}
}