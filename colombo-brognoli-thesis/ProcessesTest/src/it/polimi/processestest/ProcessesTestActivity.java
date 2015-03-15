package it.polimi.processestest;

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
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ProcessesTestActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView levelText = (TextView) findViewById(R.id.levelText);
        String output="";

        ActivityManager activityManager = (ActivityManager) this.getSystemService(ACTIVITY_SERVICE);
        MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        String TAG="mio tag";
        output+=" memoryInfo.availMem " + memoryInfo.availMem + "\n";
        output+= "memoryInfo.lowMemory " + memoryInfo.lowMemory + "\n";
        output+=" memoryInfo.threshold " + memoryInfo.threshold + "\n" ;

        
        List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        Runtime run=Runtime.getRuntime();
        try {
			Process top=run.exec("top");
			InputStream in=top.getInputStream();
			byte[] buffer=new byte[1024];
			in.read(buffer);
			String stringa="";
			for(int i=0;i<1024;i++)
				stringa+=(char)buffer[i];
			int pos=stringa.indexOf("User");
			int pos2=stringa.indexOf("System");
			int user=Integer.parseInt(""+stringa.charAt(pos+5)),system=Integer.parseInt(""+stringa.charAt(pos2+7)),tot=user+system;
			output+="user:"+stringa.charAt(pos+5)+"System:"+stringa.charAt(pos2+7)+"CPU: "+tot+"stringa: "+stringa+" ";
			top.destroy();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        Map<Integer, String> pidMap = new TreeMap<Integer, String>();
        for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses)
        {
            pidMap.put(runningAppProcessInfo.pid, runningAppProcessInfo.processName);
        }

        Collection<Integer> keys = pidMap.keySet();
        for(int key : keys)
        {
            int pids[] = new int[1];
            pids[0] = key;
            android.os.Debug.MemoryInfo[] memoryInfoArray = activityManager.getProcessMemoryInfo(pids);
            for(android.os.Debug.MemoryInfo pidMemoryInfo: memoryInfoArray)
            {
                Log.i(TAG, String.format("** MEMINFO in pid %d [%s] **\n",pids[0],pidMap.get(pids[0])));
                output+="** MEMINFO in pid"+pids[0]+" ["+pidMap.get(pids[0])+"] **\n";
               Log.i(TAG, " pidMemoryInfo.getTotalPrivateDirty(): " + pidMemoryInfo.getTotalPrivateDirty() + "\n");
                output+=" pidMemoryInfo.getTotalPrivateDirty(): " + pidMemoryInfo.getTotalPrivateDirty() + "\n";
                Log.i(TAG, " pidMemoryInfo.getTotalPss(): " + pidMemoryInfo.getTotalPss() + "\n");
                output+=" pidMemoryInfo.getTotalPss(): " + pidMemoryInfo.getTotalPss() + "\n";
                Log.i(TAG, " pidMemoryInfo.getTotalSharedDirty(): " + pidMemoryInfo.getTotalSharedDirty() + "\n");
                output+= " pidMemoryInfo.getTotalSharedDirty(): " + pidMemoryInfo.getTotalSharedDirty() + "\n";
            }
        }
        levelText.setText(output);
    }
}