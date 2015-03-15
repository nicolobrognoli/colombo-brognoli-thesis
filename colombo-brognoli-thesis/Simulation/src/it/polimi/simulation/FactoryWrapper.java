package it.polimi.simulation;
public class FactoryWrapper{
 public XWrapper getX(){
	return new XWrapper();
}
public YWrapper getY(){
	return new YWrapper();
}
}
