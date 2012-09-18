package com.example.notified;

/**
 * Klasse om EGit te testen...
 * @author tjezc
 *
 */
public class GitVragen {

public static String getVraag()
{
	String[] vragenlijst = {"Waarom git?", "Hoe wordt met code omgegaan?", "Wie beheert Git?"
		,"Hoe worden takken gebruikt?"};
	int i = new java.util.Random().nextInt(vragenlijst.length);
	return vragenlijst[i];
}
}
