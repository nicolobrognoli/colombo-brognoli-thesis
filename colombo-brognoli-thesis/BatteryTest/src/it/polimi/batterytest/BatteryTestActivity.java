package it.polimi.batterytest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.BatteryManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class BatteryTestActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
       /* WifiManager wifiManager = (WifiManager)this.getSystemService(Context.WIFI_SERVICE);
        boolean result=wifiManager.setWifiEnabled(true);*/
        
        Intent bat = this.registerReceiver(null, new 
        		IntentFilter(Intent.ACTION_BATTERY_CHANGED/*Intent.ACTION_BATTERY_LOW*/)); //Action_battery_low non è sticky, quindi se al momento della creazione non 
        // instanziato l'Intent ritornato è null, mentre per Action_battery_changed che è sticky, ovvero l'intent viene conservato fino a 
        // che qualcuno lo distrugga oppure o rimpiazzi con un aggiornamento.
       /* ConnectivityManager connectivity = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
    NetworkInfo netInfo=connectivity.getActiveNetworkInfo();
      NetworkInfo wifiInfo = connectivity.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
      NetworkInfo mobileInfo = connectivity.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);*/
        int level=0,scale=0,connected=0;
      	if(bat!=null){
        level=bat.getIntExtra(BatteryManager.EXTRA_LEVEL,0);
        scale=bat.getIntExtra(BatteryManager.EXTRA_SCALE, 100);
        connected=bat.getIntExtra(BatteryManager.EXTRA_PLUGGED,10);
        }
        TextView levelText = (TextView) findViewById(R.id.levelText);
        levelText.setText(" Livello: "+level+" Scale: "+scale+" Connesso: "+connected/*+"NetworkInfo: "+netInfo.toString()+" Mobile info: "+mobileInfo.toString()+" wifi info: "+wifiManager.getConnectionInfo().toString()*/);

    }
}