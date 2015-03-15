package it.polimi.simulation;

import java.io.BufferedWriter;
import java.io.FileWriter; 
import java.io.IOException;
import java.util.Calendar;
public class Main {
	public static void main(String[] args){
		String string = "";
		int i=0, cicles = Integer.parseInt(args[0]), value;
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
		long remaining1, remaining2 = 0, elapsed1, elapsed2;
		float probA=1, probB=1, probC=1, probD=1, probE=1;
		float minA = 3, maxA = 13, maxB = 18, minB = 10, maxC = 4, minC = 4, minD = 8, maxD = 8, minE = 12, maxE = 12;
		long startTime, endTime, delta = 0, delta1 = 0, delta2 = 0;
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
				System.out.println("\n--------------\nTest #" + i);
				probA = probB = probC = probD = probE = -1;
				string = "null";
				
				long random1 = (long) (Math.random()*15);
				long random2 = (long) (Math.random()*15);
				
				elapsed1 = Integer.parseInt(args[1]) + random1;
				elapsed2 = elapsed1 + random2;
				remaining1 = (long) (40 - elapsed1);
				remaining2 = (long) (40 - elapsed2);
				
				System.out.println("Remaining1: " + remaining1 + ", Remaining2: " + remaining2);
				
				//Hardcoded if mode
				System.out.println("\nHardcoded if mode");
				delta = 0;
				System.out.println("Entering state 3:");
				startTime = System.nanoTime();
				//calculating A probability﻿
				if(remaining1 < minA){
					probA = 0;
				}else{
					if(remaining1 < maxA){
						probA=((remaining1 - minA)/(maxA -minA));
					}else{
						probA = 1;
					}
				}
				//calculating B probability﻿
				if(remaining1 < minB){
					probB = 0;
				}else{
					if(remaining1 < maxB){
						probB=((remaining1 - minB)/(maxB -minB));
					}else{
						probB = 1;
					}
				}
				if(probA > probB){
					contA[0]++;
					x = new A();
					value = x.getInt();
				}else{
					System.out.println("Entering state 5:");
					contB[0]++;
					x = new B();
					value = x.getInt();
					//calculating C probability﻿
					if(remaining2 < minC){
						probC = 0;
					}else{
						if(remaining2 < maxC){
							probC=((remaining2 - minC)/(maxC -minC));
						}else{
							probC = 1;
						}
					}
					//calculating D probability﻿
					if(remaining2 < minD){
						probD = 0;
					}else{
						if(remaining2 < maxD){
							probD=((remaining2 - minD)/(maxD -minD));
						}else{
							probD = 1;
						}
					}
					//calculating E probability﻿
					if(remaining2 < minE){
						probE = 0;
					}else{
						if(remaining2 < maxE){
							probE=((remaining2 - minE)/(maxE -minE));
						}else{
							probE = 1;
						}
					}
					if((probC > probD)){
						if(probC > probE)
						{
							y = new C();
							string = y.getString();
							contC[0]++;
						}						
					}else if(probD > probE){
						y = new D();
						string = y.getString();
						contD[0]++;
					}else{
						y = new E();
						string = y.getString();
						contE[0]++;
					}
				}
				endTime = System.nanoTime();
				System.out.println("ProbA: " + probA + ", ProbB: " + probB+ ", ProbC: " + probC+ ", ProbD: "
						+ probD+ ", ProbE: " + probE);
				delta = endTime - startTime;
				System.out.println("Delta:" + delta);
				System.out.println("Int:" + value + ", String: " + string);
				out.append(delta+"\t");
				
				//Wrapper mode
				System.out.println("\nWrapper mode");
				delta = delta1 = delta2 = 0;
				
				System.out.println("Entering state 3:");
				startTime = System.nanoTime();
				x = new XWrapper(elapsed1);
				value = x.getInt();
				endTime = System.nanoTime();
				delta1 = endTime - startTime;
				if(value == 3)
				{
					contB[1]++;
					System.out.println("Entering state 5:");
					startTime = System.nanoTime();
					y = new YWrapper(elapsed2);
					string = y.getString();
					endTime = System.nanoTime();
					delta2 = endTime - startTime;
					if(string.contains("C"))
						contC[1]++;
					else if(string.contains("D"))
						contD[1]++;
					else
						contE[1]++;
				}
				else
					contA[1]++;
				
				delta = delta1 + delta2;
				
				System.out.println("Delta:" + delta);
				System.out.println("Int: " + value + ", String: " + string);
				out.append(delta+"\n");
				
				i++;
			}while(i<cicles);
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
			out2.append("Elapsed:"+Integer.parseInt(args[1])+"\n");
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

