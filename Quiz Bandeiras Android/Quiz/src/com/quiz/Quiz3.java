package com.quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Quiz3 extends Activity {
	
	RadioGroup rgRespostas;
	RadioButton rb;
	RadioButton rbResposta1,rbResposta2,rbResposta3,rbResposta4;
	int respostaCerta = R.id.rbResposta4;
	int pontos;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz3);
		
		rbResposta1 = (RadioButton)findViewById(R.id.rbResposta1);
		rbResposta2 = (RadioButton)findViewById(R.id.rbResposta2);
		rbResposta3 = (RadioButton)findViewById(R.id.rbResposta3);
		rbResposta4 = (RadioButton)findViewById(R.id.rbResposta4);
		rgRespostas = (RadioGroup)findViewById(R.id.rgRespostas);
	}
	
	public void btnResponderOnClick(View v) {
		
		RadioButton rb = (RadioButton)findViewById(rgRespostas.getCheckedRadioButtonId());
		RadioGroup rgRespostas = (RadioGroup) findViewById(R.id.rgRespostas);
		Intent intent = new Intent(this,Resposta.class);
			
		if(rgRespostas.getCheckedRadioButtonId() == respostaCerta) {
				intent.putExtra("acertou", true);
				Desempenho.pontos++;
			}
			else {
				intent.putExtra("pontos", false);
				
				rb.setChecked(false);
			}
		startActivity(intent);
	}
	
	@Override
	protected void onRestart() {
		super.onRestart();
		
		Intent intent = new Intent(this,Quiz4.class);
		startActivity(intent);
	}
}
