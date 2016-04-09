package com.mh.match;

import java.util.*;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class WelcomeActivity extends Activity {
	
	private Timer timer;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		final Intent intent = new Intent(this, MainActivity.class); // ��Ҫת���Activity
		timer = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				startActivity(intent); // ִ��
				finish();
			}
		};
		timer.schedule(task, 1000 * 3); // 3���
	}
	
	

	@Override
	protected void onStop() {
		// TODO �Զ����ɵķ������
		timer.cancel();
		super.onStop();
	}
	
	
	

}
