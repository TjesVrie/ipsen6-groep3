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

		// Hoi, ik zit naast Alister.
	}

	/*
	 * Simple method by Tjesco, doing everything you need
	 */
	public void doStuff() {		
		System.out.println(ask(GitVragen.getVraag()));
	}

	/*
	 * Get your answers here!
	 */
	private String ask(String question) {
		int i = question.length();
		int answer = new java.util.Random().nextInt(i);
		answer++;
		return ("Antwoord #" + answer);
	}
}
