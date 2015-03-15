package it.polimi.demo;
public class FactoryWrapper{
 	public static InputPriceInterface getInputPriceInterface(){
		return new InputPriceInterfaceWrapper();
}
	public static PhotoAcquisitionInterface getPhotoAcquisitionInterface(){
		return new PhotoAcquisitionInterfaceWrapper();
}
	public static RecognitionInterface getRecognitionInterface(){
		return new RecognitionInterfaceWrapper();
}
	public static ProductLookupInterface getProductLookupInterface(){
		return new ProductLookupInterfaceWrapper();
}
	public static LocationInterface getLocationInterface(){
		return new LocationInterfaceWrapper();
}
	public static LocalSearchInterface getLocalSearchInterface(){
		return new LocalSearchInterfaceWrapper();
}
	public static WebSearchInterface getWebSearchInterface(){
		return new WebSearchInterfaceWrapper();
}
	public static SecondaryWebSearchInterface getSecondaryWebSearchInterface(){
		return new SecondaryWebSearchInterfaceWrapper();
}
	public static ResultOrderingInterface getResultOrderingInterface(){
		return new ResultOrderingInterfaceWrapper();
}
	public static PublishPriceInterface getPublishPriceInterface(){
		return new PublishPriceInterfaceWrapper();
}
}
