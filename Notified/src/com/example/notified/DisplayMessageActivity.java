package com.example.notified;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.TextView;


public class DisplayMessageActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchresults);
        
        
        // Get the message from the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        
        final TextView mTextView = (TextView) findViewById(R.id.textView2);
       

        mTextView.setText("" + message);
        


    }
}
