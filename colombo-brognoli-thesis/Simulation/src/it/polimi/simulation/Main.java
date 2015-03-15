package it.polimi.simulation;

import java.io.BufferedWriter;
import java.io.FileWriter; 
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Main {
	public static void main(String[] args){
		String string = "";
		int i=0, cicles = Integer.parseInt(args[0]), value,k=0;
		int contA[] = new int[2];
		int contB[] = new int[2];
		int contC[] = new int[2];
		int contD[] = new int[2];
		int contE[] = new int[2];
		for(int j=0; j<2; j++){
			contA[j] = 0;
			contB[j] = 0;
			contC[j] = 0;
			contD[j] = 0;
			contE[j] = 0;
		}
		long elapsed1, elapsed2,usabilityElapsed;
		long startTime, endTime, delta = 0, delta1 = 0, delta2 = 0;
		Map<String,Float> mapReward = new HashMap<String,Float>(),mapRewardAB=new HashMap<String,Float>();
		List<String> rewardNameList = new ArrayList<String>();
		List<String> alternatives = new ArrayList<String>(),alternativesAB = new ArrayList<String>();
 		rewardNameList.add("time");
		mapReward.put("totaltime", new Float(40.0));
		mapReward.put("EtimeMin", new Float(12.0));
		mapReward.put("EtimeMax", new Float(12.0));
		alternatives.add("E");
		mapReward.put("DtimeMin", new Float(8.0));
		mapReward.put("DtimeMax", new Float(8.0));
		alternatives.add("D");
		mapReward.put("CtimeMin", new Float(4.0));
		mapReward.put("CtimeMax", new Float(4.0));
		alternatives.add("C");
 		rewardNameList.add("usability");
		mapReward.put("totalusability", new Float(13.0));
		mapReward.put("EusabilityMin", new Float(6.0));
		mapReward.put("EusabilityMax", new Float(6.0));
		mapReward.put("DusabilityMin", new Float(5.0));
		mapReward.put("DusabilityMax", new Float(5.0));
		mapReward.put("CusabilityMin", new Float(3.0));
		mapReward.put("CusabilityMax", new Float(3.0));
		
		mapRewardAB.put("totaltime", new Float(40.0));
		mapRewardAB.put("BtimeMin", new Float(10.0));
		mapRewardAB.put("BtimeMax", new Float(18.0));
		alternativesAB.add("B");
		mapRewardAB.put("AtimeMin", new Float(3.0));
		mapRewardAB.put("AtimeMax", new Float(13.0));
		alternativesAB.add("A");
		mapRewardAB.put("totalusability", new Float(13.0));
		mapRewardAB.put("BusabilityMin", new Float(5.0));
		mapRewardAB.put("BusabilityMax", new Float(8.0));
		mapRewardAB.put("AusabilityMin", new Float(4.0));
		mapRewardAB.put("AusabilityMax", new Float(9.0));

		X x;
		Y y;
		
		try {
			Calendar cal = Calendar.getInstance();
			int month = cal.get(Calendar.MONTH);
			int day = cal.get(Calendar.DATE);
			int hour = cal.get(Calendar.HOUR_OF_DAY);
			int minute = cal.get(Calendar.MINUTE);
			
			FileWriter fstream = new FileWriter("deltaTime-"+(month+1)+day+"-"+hour+minute+".txt");
			BufferedWriter out = new BufferedWriter(fstream);
			
			do{
				System.out.println("\n--------------\nTest #" + k);
				string = "null";
				
				long random1 = (long) (Math.random()*15);
				long random2 = (long) (Math.random()*15);
				long randomUsability = (long) (Math.random()*8);
				long randomUsability2 = (long) (Math.random()*2);
				
				//elapsed time
				elapsed1 = Integer.parseInt(args[1]) + random1;
				elapsed2 = elapsed1 + random2;
				//elapsed usability
				usabilityElapsed = Integer.parseInt(args[2])+randomUsability;
				long usabilityElapsed2 = usabilityElapsed+randomUsability2;
			
				Map<String,Float> contextReward= new HashMap<String,Float>();
				contextReward.put("time", new Float(elapsed1));
				contextReward.put("usability", new Float(usabilityElapsed));
				
				System.out.println("\nElapsed time: "+elapsed1 + ", Elapsed time 2: " + elapsed2);
				System.out.println("\nElapsed usability: "+usabilityElapsed + ", Elapsed usability 2: "+ usabilityElapsed2);
				
				//Hardcoded if mode
				System.out.println("\nHardcoded if mode");
				System.out.println("Entering state 3:");
				String  tempReward = "", tempAltName,maxAlternative="";
				int j=0;
				float valueMin,valueMax,totalProb=1,maxValue=-1;
				delta = delta1 = delta2 = 0;
				//start delta 1
				startTime = System.nanoTime();
				//calcolo massimo tra A,B
				for(i=0;i<alternativesAB.size();i++){
					tempAltName = alternativesAB.get(i);
					for(j=0; j<rewardNameList.size(); j++){
						tempReward=rewardNameList.get(j);
						float remaining = mapRewardAB.get("total" + tempReward)- contextReward.get(tempReward);//TODO: tirare fuori l'inizializzazione del remaining?
						valueMin = mapRewardAB.get(tempAltName+tempReward+"Min");
						valueMax=mapRewardAB.get(tempAltName+tempReward+"Max");
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
					if(totalProb>maxValue){
						maxValue=totalProb;
						maxAlternative=tempAltName;
					}
					totalProb=1;
				}
				if(maxAlternative.equals("A")){
					contA[0]++;
					x = new A();
					value = x.getInt();
					//end delta 1
					endTime = System.nanoTime();
					delta1 = endTime - startTime;
				}
				else{
					contB[0]++;
					x = new B();
					value = x.getInt();
					//end delta 1
					endTime = System.nanoTime();
					delta1 = endTime - startTime;
					maxValue=-1;
					contextReward.clear();
					contextReward.put("time", new Float(elapsed2));
					contextReward.put("usability", new Float(usabilityElapsed2));
					//start delta 2
					startTime = System.nanoTime();
					//calcolo massimo tra C,D,E
					for(i=0;i<alternatives.size();i++){
						tempAltName = alternatives.get(i);
						for(j=0; j<rewardNameList.size(); j++){
							tempReward=rewardNameList.get(j);
							float remaining = mapReward.get("total" + tempReward)- contextReward.get(tempReward);
							valueMin = mapReward.get(tempAltName+tempReward+"Min");
							valueMax=mapReward.get(tempAltName+tempReward+"Max");
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
						if(totalProb>maxValue){
							maxValue=totalProb;
							maxAlternative=tempAltName;
						}
						totalProb=1;
					}
					if(maxAlternative.equals("C")){
						contC[0]++;
						y=new C();
					}
					else{
						if(maxAlternative.equals("D")){
							contD[0]++;
							y=new D();
						}else{
							contE[0]++;
							y=new E();
						}
					}
					string=y.getString();
					//end delta 2
					endTime = System.nanoTime();
					delta2 = endTime - startTime;
				}

				delta = delta1 + delta2;
				System.out.println("Delta:" + delta);
				System.out.println("Int:" + value + ", String: " + string);
				out.append(delta+"\t");
				
				//Wrapper mode
				System.out.println("\nWrapper mode");
				delta = delta1 = delta2 = 0;
				
				System.out.println("Entering state 3:");
				contextReward.put("time", new Float(elapsed1));
				contextReward.put("usability", new Float(usabilityElapsed));
				//start delta 1
				startTime = System.nanoTime();
				x = new XWrapper(contextReward);
				value = x.getInt();
				//end delta 1
				endTime = System.nanoTime();
				delta1 = endTime - startTime;
				if(value == 1)
				{
					contB[1]++;
					System.out.println("Entering state 5:");					
					contextReward.clear();
					contextReward.put("time", new Float(elapsed2));
					contextReward.put("usability", new Float(usabilityElapsed2));
					//start delta 2
					startTime = System.nanoTime();
					y = new YWrapper(contextReward);
					string = y.getString();					
					if(string.equals("C"))
						contC[1]++;
					else if(string.equals("D"))
						contD[1]++;
					else
						contE[1]++;
					//end delta 2
					endTime = System.nanoTime();
					delta2 = endTime - startTime;
				}
				else
					contA[1]++;
				
				delta = delta1 + delta2;
				
				System.out.println("Delta:" + delta);
				System.out.println("Int: " + value + ", String: " + string);
				out.append(delta+"\n");
				
				k++;
			}while(k<cicles);
			out.close();
			System.out.println("Simulation completed.");
			
			System.out.println("A: cont_if="+contA[0]+", cont_wrapper="+contA[1]);
			System.out.println("B: cont_if="+contB[0]+", cont_wrapper="+contB[1]);
			System.out.println("C: cont_if="+contC[0]+", cont_wrapper="+contC[1]);
			System.out.println("D: cont_if="+contD[0]+", cont_wrapper="+contD[1]);
			System.out.println("E: cont_if="+contE[0]+", cont_wrapper="+contE[1]);
			

			FileWriter fstream2 = new FileWriter("contValues-"+(month+1)+day+"-"+hour+minute+".txt");
			BufferedWriter out2 = new BufferedWriter(fstream2);
			
			out2.append("Samples:"+cicles+"\n");
			out2.append("Elapsed time:"+Integer.parseInt(args[1])+"\n");
			out2.append("Elapsed usability:"+Integer.parseInt(args[2])+"\n");
			out2.append("A:"+contA[0]+"\n");
			out2.append("B:"+contB[0]+"\n");
			out2.append("C:"+contC[0]+"\n");
			out2.append("D:"+contD[0]+"\n");
			out2.append("E:"+contE[0]+"\n");
			
			out2.close();	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

