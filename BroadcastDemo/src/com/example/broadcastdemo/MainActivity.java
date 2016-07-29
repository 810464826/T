package com.example.broadcastdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {

	
private MyBroadcastReceiver myBroadcastReceiver;

	private Button button;
  
  @Override
    protected void onCreate(Bundle savedInstanceState) {
    
    super.onCreate(savedInstanceState);
       
 setContentView(R.layout.activity_main);
       
 
        button = (Button) findViewById(R.id.button);
     
   
        myBroadcastReceiver = new MyBroadcastReceiver();
    
   
        button.setOnClickListener(new OnClickListener() {
	
	@Override
			
public void onClick(View arg0) {

  myBroadcastReceiver.onReceive(MainActivity.this, new Intent("TEST_ACTION"));
	
		}
		});
    }
}

