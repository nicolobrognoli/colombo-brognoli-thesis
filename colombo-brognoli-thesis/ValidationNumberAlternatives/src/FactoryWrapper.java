
public class FactoryWrapper{
	
 	public static StarterWrapper getStarterWrapper(){
		return new StarterWrapper();
}
 	public static Wrapper getWrapper(){
 			return new Wrapper();
 	}
}
