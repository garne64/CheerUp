package com.example.cheerup;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class FormCR extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_form_cr);
		
		TextView textView = (TextView)findViewById(R.id.textView2);
		SpannableString content = new SpannableString("Content");
		content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
		textView.setText(content);
		
		textView = (TextView)findViewById(R.id.textView5);
		content = new SpannableString("Content");
		content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
		textView.setText(content);
		
		textView = (TextView)findViewById(R.id.textView6);
		content = new SpannableString("Content");
		content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
		textView.setText(content);

		
		Spinner spinner = (Spinner) findViewById(R.id.spinner1);
		// Create an ArrayAdapter using the string array and a default spinner layout
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
		        R.array.antenne, android.R.layout.simple_spinner_item);
		// Specify the layout to use when the list of choices appears
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// Apply the adapter to the spinner
		spinner.setAdapter(adapter);
		
		Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
		// Create an ArrayAdapter using the string array and a default spinner layout
		ArrayAdapter<CharSequence> benevole = ArrayAdapter.createFromResource(this,
		        R.array.benevole, android.R.layout.simple_spinner_item);
		// Specify the layout to use when the list of choices appears
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// Apply the adapter to the spinner
		spinner2.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.form_cr, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
