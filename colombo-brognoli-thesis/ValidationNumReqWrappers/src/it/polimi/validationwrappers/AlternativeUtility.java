package it.polimi.validationwrappers;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlternativeUtility {
	//variabile ThreadLocal per gestire correttamente aggiornamenti
	private static final ThreadLocal <Long> startTime = new ThreadLocal < Long > ();
	private static final ThreadLocal <Map<String, Float>> cumulatedReward = new ThreadLocal <Map<String, Float>> ();
	
	public static String getAlternative(List<String> altNames, List<String> rewNames, Map<String, Float> rewardMap){
		String  tempReward = "", tempAltName="",maxAlternative="";
		int i=0, j=0;
		float valueMin,valueMax,totalValue=0,maxValue=0, weight, remaining, elapsedTime, policy,currentValue;
		Map<String, Float> tempMap;
		//for each alternative compute the probability
		for(i=0;i<altNames.size();i++){
			tempAltName = altNames.get(i);
			for(j=0; j<rewNames.size(); j++){
				tempReward=rewNames.get(j);
				//get the policy for the specified reward
				policy = rewardMap.get("policy" + tempReward);
				//TODO: cercare di rendere non hardcoded per il tempo
				if(tempReward.equals("time"))
				{
					elapsedTime = (float) ((System.nanoTime() - startTime.get()) / Math.pow(10, 9));
					remaining = rewardMap.get("total" + tempReward) - elapsedTime;
					//System.out.println("[ADAPTIVE LOGIC] Remaining Time: " + remaining +"\n[ADAPTIVE LOGIC] Elapsed: " +elapsedTime);
				}
				else
				{
					tempMap = cumulatedReward.get();
					currentValue = tempMap.get(tempReward);
					remaining = rewardMap.get("total" + tempReward) - currentValue;
					//System.out.println("[ADAPTIVE LOGIC] Remaining "+ tempReward +": "+ remaining);
				}
				
				//TODO: rimuovere system out per conteggio tempo
				
				valueMin = rewardMap.get(tempAltName+tempReward+"Min");
				valueMax = rewardMap.get(tempAltName+tempReward+"Max");
				weight = rewardMap.get("weight" + tempReward);
				//TODO: controllare correttezza operazioni (vedi logica Leandro)
				if(remaining< valueMin){
					// condition ? lower policy : upper policy
					totalValue = (policy == 0) ? totalValue:totalValue + (1*weight);
				}else{
					if(remaining<valueMax){						
						if(policy == 0)
						{
							//lower policy
							totalValue += weight * ((remaining - valueMin)/(valueMax -valueMin));
						}							
						else
						{
							//upper policy
							totalValue += weight *  (1 - ((remaining - valueMin)/(valueMax -valueMin)));
						}
					}else{
						// condition ? lower policy : upper policy
						totalValue = (policy == 0) ? (weight * 1)+totalValue: totalValue;
					}
				}
			}
			//System.out.println("[ADAPTIVE LOGIC] Total value "+ tempAltName +": " + totalValue);
			if(totalValue>maxValue){
				maxValue=totalValue;
				maxAlternative=tempAltName;
			}
			totalValue=0;
		}
		if(maxAlternative.equals("")&&(altNames.size()>1))
			maxAlternative=tempAltName;
		return maxAlternative;
	}

	
	public static void start(List<String> rewNames){
		startTime.set(System.nanoTime());
		//System.out.println("[ADAPTIVE LOGIC] StartTime: " + startTime.get());
		String tempReward;
		Map<String, Float> temp = new HashMap<String, Float>();
		for(int j=0; j<rewNames.size(); j++){
			tempReward = rewNames.get(j);
			temp.put(tempReward, 0f);			
			cumulatedReward.set(temp);
		}
	}

	
	 public static void updateContext(List<String> rewardNameList, String choice, Map<String, Float> rewardMap){
         Map<String, Float> tempMap = new HashMap<String, Float>();
         float value, currentValue;
         for(String rewName: rewardNameList){
             //get reward value for the specified choice
             value = rewardMap.get(choice+rewName);
             //update the cumulated reward value
             tempMap = cumulatedReward.get();
             currentValue = tempMap.remove(rewName);
             tempMap.put(rewName, currentValue + value);
             cumulatedReward.set(tempMap);
         }
         
	 }
}
