package com.example.cheerup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class TrouverUnJeune extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.trouver_un_jeune);
		Spinner spinner = (Spinner) findViewById(R.id.spinner1);
		// Create an ArrayAdapter using the string array and a default spinner layout
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
		        R.array.hospitals, android.R.layout.simple_spinner_item);
		// Specify the layout to use when the list of choices appears
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// Apply the adapter to the spinner
		spinner.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.trouver_un_jeune, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
Intent i = new Intent();
		
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		else if (id == R.id.accueil) 
		{
			i.setClass(this, MenuPrincipalBenevole.class);
		}
		else if (id == R.id.disponibilites)
		{
			i.setClass(this, DisponibilitesBenevoles.class);
		}
		else if (id == R.id.trouverJeune)
		{
			i.setClass(this, TrouverUnJeune.class);
		}
		else if (id == R.id.posterCR)
		{
			i.setClass(this, FormCR.class);
		}
		
		if (i.getClass() != null)
		{	
			this.startActivity(i);
		}
		return super.onOptionsItemSelected(item);
	}
}
