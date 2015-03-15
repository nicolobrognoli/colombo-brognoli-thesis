package it.polimi.niceness;

import android.app.Activity;
import android.os.Bundle;
import android.os.Process;
import android.widget.LinearLayout;
import android.widget.TextView;

public class NicenessActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        LinearLayout ln = new LinearLayout(this);
        ln.setOrientation(LinearLayout.VERTICAL);
        TextView tv = new TextView(this);
        
        ln.addView(tv);
        setContentView(ln);
        
        tv.setText("Current priority: " + Process.getThreadPriority(Process.myTid()) + " - process: " + Process.myTid());  
       
        //change priority/niceness        
        Process.setThreadPriority(13);
        tv.append("\nChanged priority: " + Process.getThreadPriority(Process.myTid()));
        
        
    }
}