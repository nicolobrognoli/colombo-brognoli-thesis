package it.polimi;

import java.io.FileDescriptor;
import java.util.List;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class ProcessLifecycleStateActivity extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
	TextView tv;
	private FileDescriptor out;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        LinearLayout ln = new LinearLayout(this);
        tv = new TextView(this);
        tv.setText("Process state: ");        
        Button b = new Button(this);
        b.setText("Get");
        b.setOnClickListener(this);
        ln.addView(tv);
        ln.addView(b);
        
        setContentView(ln);
        
    }

	@Override
	public void onClick(View v) {
		ActivityManager actvityManager = (ActivityManager) this.getSystemService( ACTIVITY_SERVICE );
		List<RunningAppProcessInfo> procInfos = actvityManager.getRunningAppProcesses();
		String importance;
		for(int i = 0; i < procInfos.size(); i++){
			switch(procInfos.get(i).importance){
			case 400:
			{
				importance = "background";
				break;
			}
			case 500:
			{
				importance = "empty";
				break;
			}
			case 100:
			{
				importance = "foreground";
				break;
			}
			case 130:
			{
				importance = "perceptible";
				break;
			}
			case 300:
			{
				importance = "service";
				break;
			}
			case 200:
			{
				importance = "visible";
				break;
			}
			default:
			{
				importance = "unknown";
				break;
			}
				
			}
			tv.append("\n" + procInfos.get(i).processName + " Importance: " + importance);
			
		}

		
		
//		Process p;  
//		
//			try {
//				p = Runtime.getRuntime().exec("su");
//				p = Runtime.getRuntime().exec("dumpsys activity");
//				InputStream in=p.getInputStream();
//				byte[] buffer=new byte[1024];
//				in.read(buffer);
//				String stringa="";
//				for(int i=0;i<1024;i++)
//					stringa+=(char)buffer[i];
//				tv.append(stringa);
//				Log.d("dump", stringa);
//				p.destroy();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		
		
//		String FILENAME = "hello_file";
//		String string = "hello world!";
//
//		Process p;  
//		   try {
//			p = Runtime.getRuntime().exec("su");
//		
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}   
//
//		
//		try {
//			FileOutputStream fos;			
//			
//			fos = openFileOutput(FILENAME, Context.MODE_PRIVATE);
//			fos.write(string.getBytes());
//			
//			fos.close();
//			
//			FileDescriptor fd = fos.getFD();
//			
//			
//			PrintWriter pr = new PrintWriter(FILENAME);
//			
//			this.dump("", fd, pr, null);
			
//			
//		} catch (FileNotFoundException e2) {
//			// TODO Auto-generated catch block
//			e2.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		
//		
//		File f = new File("/cache","dump");
//		String readString = "";
//		try {
//			f.canWrite();
//			f.createNewFile();		
//			FileOutputStream fOut = new FileOutputStream(f);
//			FileDescriptor fd = fOut.getFD();
//			
//			this.dump("", fd, new PrintWriter(f), null);
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		try {
			
			
			 // ##### Read the file back in #####
            
            /* We have to use the openFileInput()-method
             * the ActivityContext provides.
             * Again for security reasons with
             * openFileInput(...) */
//            FileInputStream fIn = openFileInput("/data/user/dump");
//            InputStreamReader isr = new InputStreamReader(fIn);
//            /* Prepare a char-Array that will
//             * hold the chars we read back in. */
//            char[] inputBuffer = new char[256];
//            // Fill the Buffer with data from the file
//            isr.read(inputBuffer);
//            // Transform the chars to a String
//            String readString = new String(inputBuffer);
//			FileInputStream fIn = openFileInput();
//            BufferedReader in = new BufferedReader(new InputStreamReader(fIn));
//            while (in.ready()) {
//                tv.append(in.readLine());
//            }
//            in.close();
//		
//		} catch (FileNotFoundException e) {
//			//tv.setText("File not found exc.");
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
}