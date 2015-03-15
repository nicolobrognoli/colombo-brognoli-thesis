package it.polimi.thesis.generator;

import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class Main {
	/**
	 * @param args
	 * @throws IOException 
	 * @throws SAXException 
	 * @throws ParserConfigurationException 
	 */
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		String modelFile = args[0], bindingFile = args[1], destinationPath= args[2],namePackage=args[3];
		Map<String, State> statesList = new HashMap<String, State>();
		//list of interfaces name
		List<String> interfacesList = new ArrayList<String>();

		statesList = Utility.processPrismModel(modelFile);
		
		Utility.processXMLModel(bindingFile, statesList, interfacesList);
		
		Utility.printStatesSet(statesList);
			
		Utility.generateEmptyInterfaces(namePackage,destinationPath,interfacesList);
		
		Utility.generateEmptyClasses(namePackage,destinationPath,statesList);
	}
}