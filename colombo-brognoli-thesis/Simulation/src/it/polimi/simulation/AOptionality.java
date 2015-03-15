package it.polimi.simulation;
public class AOptionality{

	private static float totaltime = new Float(40.0);
	private static float optiontimeMin  = new Float(11.0);
	private static float optiontimeMax  = new Float(11.0);
	private static float finaltimeMin  = new Float(1.0);
	private static float finaltimeMax  = new Float(1.0);
	private static float totalusability = new Float(13.0);
	private static float optionusabilityMin  = new Float(7.0);
	private static float optionusabilityMax  = new Float(7.0);
	private static float finalusabilityMin  = new Float(2.0);
	private static float finalusabilityMax  = new Float(2.0);

	public static boolean doOptional(int elapsedTime){
	return true;
	}
}