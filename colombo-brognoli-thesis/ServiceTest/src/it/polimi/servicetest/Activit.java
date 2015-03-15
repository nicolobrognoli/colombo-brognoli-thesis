package it.polimi.servicetest;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activit extends Activity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.main);                      
        
        //just pass the reference to the service
        ServiceTestClass.setMainActivity(this);
        
        //creating an intent for the service
        final Intent fileScannerService = new Intent(this,  ServiceTestClass.class);

        //start button
        Button btnStart = (Button) findViewById(R.id.btn_start);
        //start button on click
        btnStart.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {

                //start the service
                startService(fileScannerService);
                
                //remove or hide the app
                finish();                
            }
        });

        //stop button
        Button btnStop = (Button) findViewById(R.id.btn_stop);

        //on click of stop button
        btnStop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view)
            {             
                //stop the service
                stopService(fileScannerService);  

                //remove or hide the app
                finish(); 
            }
        });
    }
    
   
    @Override 
    protected void onDestroy() {
          super.onDestroy();
          
    }
}
