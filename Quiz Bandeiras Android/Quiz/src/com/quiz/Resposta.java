package com.quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Resposta extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_resposta);
		
		ImageView imgResposta = (ImageView)findViewById(R.id.imgResposta);
		
		Intent intent = getIntent();
		
		boolean acertou = intent.getBooleanExtra("acertou", false);
		
		if(acertou) {
			imgResposta.setImageResource(R.drawable.acertou);
		}
		else {
			imgResposta.setImageResource(R.drawable.errou);
		}
		
		Thread thread = new Thread(new Runnable() {
				
		@Override
		public void run() {
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			finish();
			}
		});
		thread.start();
	}
}
