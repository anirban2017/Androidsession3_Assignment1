package com.anirban.myapp.assignment;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class Activity1 extends Activity {



	EditText mEdit;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity1);
		mEdit=(EditText)findViewById(R.id.edittext1);
	}



	public void openWebPage(View v) {

		String q = mEdit.getText().toString();
		//create implicit Intent
		Intent intent = new Intent(Intent.ACTION_WEB_SEARCH );
		intent.putExtra(SearchManager.QUERY, q);
		startActivity(intent);
	}


}