package it.polimi.distribution;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public class MainDistribution {
	public static void main(String[] args) throws InterruptedException, IOException{
		int i=0, cicles = Integer.parseInt(args[0]);
		long delay1 = Integer.parseInt(args[1]),startTime,endTime,value;
		
		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		
		FileWriter fstream = new FileWriter("distribution-"+(month+1)+day+"-"+hour+minute+".txt");
		BufferedWriter out = new BufferedWriter(fstream);
		System.out.println("Distribution test started: it will take " + ((cicles*delay1)/1000) + "s");
		for(i=0;i<cicles;i++){			
			startTime = System.nanoTime();
			Thread.sleep(delay1);
			endTime = System.nanoTime();
			value=endTime-startTime-delay1*1000000;
			out.append(value+"\n");
		}
		out.close();
		System.out.println("Distribution test completed.");
	}

}
