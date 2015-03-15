package it.polimi.validation;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberActivities=Integer.parseInt(args[0]),j,i;
		long start,end,hardcodedTime,wrapperTime;
		float proveHardcoded[]=new float[30],proveWrapper[]=new float[30],hardcodedMeans,wrapperMeans,
				totalHardcoded,totalWrapper;
		//for(j=0;j<30;j++){
			start=System.nanoTime();
			for(i=0;i<numberActivities;i++){
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			end=System.nanoTime();
			hardcodedTime=end-start;
			proveHardcoded[/*j*/0]=(float)(hardcodedTime/Math.pow(10, 9));
			Wrapper wrapper=new Wrapper();
			start=System.nanoTime();
			for(i=0;i<numberActivities;i++){
				FactoryWrapper.getWrapper().doActivity();
			}
			end=System.nanoTime();
			wrapperTime=end-start;
			proveWrapper[/*j*/0]=(float)(wrapperTime/Math.pow(10, 9));
			System.out.println(proveHardcoded[/*j*/0]+"\t"+proveWrapper[/*j*/0]);
		//}
		//for(totalHardcoded=totalWrapper=j=0;j<30;j++){
		//	totalHardcoded+=proveHardcoded[j];
		//	totalWrapper+=proveWrapper[j];
		//}
		//hardcodedMeans=totalHardcoded/30;
		//wrapperMeans=totalWrapper/30;
		//System.out.println("Media hardcoded: "+hardcodedMeans+" |media wrapper: "+wrapperMeans);
	}
}
