package com.example.notified;

import android.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	public final static String EXTRA_MESSAGE = "appel";

    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) 
    {
    	
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void ShowOverzicht(View sender) 
    {

    	Intent intent = new Intent(this, Custom_ExpandableListView.class);
    	startActivity(intent);

    }
    
    public void Search(View view)
    {
    	Intent intent = new Intent(this,DisplayMessageActivity.class);
    	EditText editText = (EditText) findViewById(R.id.editText1);
    	intent.putExtra(EXTRA_MESSAGE, editText.getText().toString());
    	startActivity(intent);
    }
}
