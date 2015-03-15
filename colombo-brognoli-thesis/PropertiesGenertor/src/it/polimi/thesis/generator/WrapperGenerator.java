package it.polimi.thesis.generator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class WrapperGenerator {

	Map<String, State> statesList;
	/**
	 * @param args
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 * @throws SAXException 
	 */

	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		String interfacesPath = args[0], modelFile = args[1], bindingFile = args[2],namePackage=args[3];
		//list of interfaces name
		List<String> interfacesList = new ArrayList<String>();
		//map of the application states (numID, State)
		Map<String, State> statesList = new HashMap<String, State>();
		//list for optionality
		List<Reward> rewardsList = new ArrayList<Reward>();
		
		//process prism model
		statesList = Utility.processPrismModel(modelFile);
		
		//process XML model file
		rewardsList = Utility.processXMLModel(bindingFile, statesList, interfacesList);
		
		//print the set of states//TODO: for debug, eliminare quando è finito.
		Utility.printStatesSet(statesList);
		
		//generate wrappers
		Utility.generateWrappers(namePackage,interfacesPath, interfacesList, rewardsList, statesList);
		
	}
}
