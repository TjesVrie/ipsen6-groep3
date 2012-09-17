package com.example.notified;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
        
        //Hoi, ik zit naast Alister.
    }
    
    /*
     * Simple method by Tjesco, doing everything you need
     */
    public void doStuff()
    {
    	// do stuff
    	// deleted branch yet?
    }
}
