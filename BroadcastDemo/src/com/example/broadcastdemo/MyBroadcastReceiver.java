package com.example.broadcastdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		if(intent.getAction().equals("TEST_ACTION")){
		    Toast.makeText(context, "�յ��㲥", 1000).show();
		}
		//��ֹ�㲥
		//abortBroadcast(); 
	}

}
