package it.polimi.simulation;
public class YFactory {

 	public static YWrapper getWrapper(float context){
		return new YWrapper(context);
	}
}