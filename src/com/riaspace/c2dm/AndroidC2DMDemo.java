package com.riaspace.c2dm;

import com.google.android.c2dm.C2DMessaging;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class AndroidC2DMDemo extends Activity {
    /** Called when the activity is first created. */
	private static final String TAG = "AndroidC2DMDemo";
	public static final String SENDER_ID = "jarvis.chung823@gmail.com"; //使用C2DM服务的用户账户
	public static final String MESSAGE_KEY_ONE = "msg";   //和服务器商量好的接收消息的键值key
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Log.v(TAG, "Start");
        //向C2DM服务器注册
        C2DMessaging.register(this, SENDER_ID);
    }
    
    
}
