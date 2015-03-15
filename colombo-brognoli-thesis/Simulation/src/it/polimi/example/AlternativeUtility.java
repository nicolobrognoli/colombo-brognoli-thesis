package it.polimi.example;

import java.util.List;
import java.util.Map;

public class AlternativeUtility {
	
	public static String getAlternative(Float context,List<String> altNames, List<String> rewNames, Map<String, Float> rewardMap){
		String  tempReward = "", tempAltName,maxAlternative="";
		int i=0, j=0;
		//TODO: catturare il valore attuale della metrica
		float valueMin,valueMax,totalProb=1,maxValue=-1;

		//for each alternative compute the probability
		for(i=0;i<altNames.size();i++){
			tempAltName = altNames.get(i);
			for(j=0; j<rewNames.size(); j++){
				tempReward=rewNames.get(j);
				float remaining = rewardMap.get("total" + tempReward)- context;
				//TODO: rimuovere system out per conteggio tempo
				System.out.println("**Remaining: " + remaining);
				valueMin = rewardMap.get(tempAltName+tempReward+"Min");
				valueMax=rewardMap.get(tempAltName+tempReward+"Max");
				if(remaining< valueMin){
					totalProb=totalProb*0;
				}else{
					if(remaining<valueMax){
						totalProb=totalProb*((remaining - valueMin)/(valueMax -valueMin));
					}else{
						totalProb=totalProb*1;
					}
				}
			}
			System.out.println("**TotalProb"+ tempAltName +": " + totalProb);
			if(totalProb>maxValue){
				maxValue=totalProb;
				maxAlternative=tempAltName;
			}
			totalProb=1;
		}
		
		return maxAlternative;
	}
}
