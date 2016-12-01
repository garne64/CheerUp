package com.example.cheerup;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;

public class ThreadTimer extends Thread{
	
	Activity act;

	public ThreadTimer(Activity act) {
		super();
		this.act = act;
	}

	@Override
	public void run(){
		try{
			synchronized(this){
				wait(3000);
			}
		}
		catch(InterruptedException ex){ Log.i("&Error", "Error ThearTimer"); }
		
		Intent i = new Intent();
		i.setClass(act, Connexion.class);
		act.startActivity(i);
	}
	

}
