package com.example.cheerup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

public class DisponibilitesBenevoles extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.disponibilites_benevoles);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.disponibilites_benevoles, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
Intent i = new Intent();
		
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
