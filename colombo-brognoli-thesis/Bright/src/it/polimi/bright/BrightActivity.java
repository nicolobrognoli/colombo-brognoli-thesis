package it.polimi.bright;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

public class BrightActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        WindowManager.LayoutParams lp = getWindow().getAttributes();
        lp.screenBrightness = 10 / 100.0f;
        getWindow().setAttributes(lp);
    }
}