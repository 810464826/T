package com.example.broadcastdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		if(intent.getAction().equals("TEST_ACTION")){
		    Toast.makeText(context, "收到广播", 1000).show();
		}
		//终止广播
		//abortBroadcast(); 
	}

}
