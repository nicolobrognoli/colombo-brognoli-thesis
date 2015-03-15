package it.polimi.mediaplayer;

import android.app.Activity;
import android.media.AudioManager;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MediaPlayerActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
       AudioManager am = (AudioManager) this.getSystemService(this.AUDIO_SERVICE);
        
        LinearLayout ln = new LinearLayout(this);
        TextView tv = new TextView(this);
        tv.setText("Audio Player Playing: " + am.isMusicActive());   
        ln.addView(tv);
        setContentView(ln);
        
        //per il top process name: /system/bin/mediaserver stesso anche per la riproduzione dei video
        //quindi si può capire se è audio o video con la funzione precedente e se il processo è attivo
        
        //PCY in top è lo stato: background oppure foreground
        
        //per le immagini il processo è: com.android.gallery
        

        
    }
}