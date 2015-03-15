package it.polimi.simulation;
public class XFactory {

 	public static XWrapper getWrapper(float context){
		return new XWrapper(context);
	}
}