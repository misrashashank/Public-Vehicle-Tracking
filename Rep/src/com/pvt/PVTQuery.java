package com.pvt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class PVTQuery extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pvtquery);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_pvtquery, menu);
		return true;
	}

	public void Track(View v)
	{
		Intent intent = new Intent(this, Track.class);
		startActivity(intent);
	}
	
	public void RegVeh(View v)
	{
		Intent intent = new Intent(this, BusList.class);
		startActivity(intent);
	}
	
	public void OpenMap(View v)
	{
		Intent intent = new Intent(this, Tracking.class);
		startActivity(intent);
	}
}
