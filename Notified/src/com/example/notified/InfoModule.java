package com.example.notified;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class InfoModule extends Activity
{
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.infomodule);
		
		 
        // Get the message from the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(Custom_ExpandableListView.EXTRA_MESSAGE);

        System.out.println("PART + " + message);
        final TextView mTextView = (TextView) findViewById(R.id.textView3module);
       

        mTextView.setText("" + message);
	}
	
	

}
