


public class MainSecondaEsecuzione {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberActivities=Integer.parseInt(args[0]),j,i;
		long start,end,hardcodedTime,wrapperTime;
		float proveHardcoded[]=new float[30],proveWrapper[]=new float[30],hardcodedMeans,wrapperMeans,
				totalHardcoded,totalWrapper;
		//for(j=0;j<30;j++){
//			start=System.nanoTime();
//			try {
//				Thread.sleep(50);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}//inserito uno prima del for, perchè nel caso del wrapper ho dovuto fare un activity all'inizio per 
//			//far partire il contatore del tempo con la prima activity.
//			for(i=0;i<numberActivities;i++){
//				try {
//					Thread.sleep(50);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			end=System.nanoTime();
//			hardcodedTime=end-start;
//			proveHardcoded[/*j*/0]=(float)(hardcodedTime/Math.pow(10, 9));
			start=System.nanoTime();
			FactoryWrapper.getStarterWrapper().doActivity();
			for(i=0;i<numberActivities;i++){
				FactoryWrapper.getWrapper().doActivity();
			}
			end=System.nanoTime();
			wrapperTime=end-start;
			proveWrapper[/*j*/0]=(float)(wrapperTime/Math.pow(10, 9));
			//System.out.println("Tempo trascorso con wrapper: "+proveWrapper[/*j*/0]);
		//}
		//for(totalHardcoded=totalWrapper=j=0;j<30;j++){
		//	totalHardcoded+=proveHardcoded[j];
		//	totalWrapper+=proveWrapper[j];
		//}
		//hardcodedMeans=totalHardcoded/30;
		//wrapperMeans=totalWrapper/30;
		System.out.println(/*wrapperMeans*/proveWrapper[0]);
	}


}
