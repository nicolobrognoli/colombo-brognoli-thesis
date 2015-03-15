package it.polimi.servicetest;


import java.util.Timer;
import java.util.TimerTask;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;


public class ServiceTestClass extends Service {

	  public static Activit MAIN_ACTIVITY;    
	    
	    private Timer timer=new Timer();    

	    private static long UPDATE_INTERVAL = 1*10*1000;  //default

	    private static long DELAY_INTERVAL = 0; 
	    NotificationManager mNotificationManager;
    	final int HELLO_ID = 1;
    	Notification notification;
	    
	    // hooks main activity here    
	    public static void setMainActivity(Activit activity) 
	    {
	      MAIN_ACTIVITY = activity;      
	    }
	    
	    /* 
	     * not using ipc...but if we use in future
	     */
	    public IBinder onBind(Intent intent) {
	      return null;
	    }

	    @Override 
	    public void onCreate() 
	    {
	    	String ns = Context.NOTIFICATION_SERVICE;
	    	mNotificationManager = (NotificationManager) getSystemService(ns);
	    	int icon = R.drawable.ic_launcher;
	    	CharSequence tickerText = "Hello";
	    	long when = System.currentTimeMillis();

	    	notification = new Notification(icon, tickerText, when);
	    	Context context = getApplicationContext();
	    	CharSequence contentTitle = "My notification";
	    	CharSequence contentText = "Hello World!";
	    	Intent notificationIntent = new Intent(this, ServiceTestClass.class);
	    	PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent, 0);

	    	notification.setLatestEventInfo(context, contentTitle, contentText, contentIntent);


	      super.onCreate();     

	      _startService();

	      if (MAIN_ACTIVITY != null)  Log.d(getClass().getSimpleName(), "FileScannerService started");
	    }

	    @Override 
	    public void onDestroy() 
	    {
	      super.onDestroy();

	      _shutdownService();

	      if (MAIN_ACTIVITY != null)  Log.d(getClass().getSimpleName(), "FileScannerService stopped");
	    }

	    
	    /*
	     * starting the service
	     */
	    private void _startService()
	    {      
	      timer.scheduleAtFixedRate(    
	          
	              new TimerTask() {

	                    public void run() {

	                        try{

	                        doServiceWork();

	                        Thread.sleep(UPDATE_INTERVAL);

	                        }catch(InterruptedException ie){

	                            Log.e(getClass().getSimpleName(), "FileScannerService InterruptedException"+ie.toString());
	                        }
	                        
	                    }
	                  },
	                  DELAY_INTERVAL,
	                  UPDATE_INTERVAL);

	      Log.i(getClass().getSimpleName(), "FileScannerService Timer started....");
	    }
	    
	    /*
	     * start the processing, the actual work, getting config params, get data from network etc
	     */
	    private void doServiceWork()
	    {
		      Log.i(getClass().getSimpleName(), "Ciao");
	    	/*Handler handler=new Handler();

        	final CharSequence text = "Hello toast!";
        	final int duration = Toast.LENGTH_SHORT;
            handler.post(new Runnable() {
                public void run() {
                	Toast.makeText(getApplicationContext(), text, duration).show();
                }
             });*/

	    	mNotificationManager.notify(HELLO_ID, notification);
	        
	    }
	    
	    /*
	     * shutting down the service
	     */
	    private void _shutdownService()
	    {
	      if (timer != null) timer.cancel();
	      Log.i(getClass().getSimpleName(), "Timer stopped...");
	    }
}
/*Metodo per far funzionare i toast nei servizi*/
/*
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.widget.Toast;

public class MyService extends Service{

String msg="I m Toast";

Thread t = new Thread(){
public void run(){

Message myMessage=new Message();
Bundle resBundle = new Bundle();
resBundle.putString("status", "SUCCESS");
myMessage.obj=resBundle;
handler.sendMessage(myMessage);
}
};



private Handler handler = new Handler() {
@Override
public void handleMessage(Message msg) {
Toast.makeText(getApplicationContext(), "msg", Toast.LENGTH_LONG).show();
}
};


@Override
public IBinder onBind(Intent intent) {
// TODO Auto-generated method stub

return null;
}

@Override
public void onCreate() {
 t.start();
}


}*/