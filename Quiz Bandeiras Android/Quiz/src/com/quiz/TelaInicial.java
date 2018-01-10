package com.quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaInicial extends Activity {
	
	EditText editNome;
	Button buttonJogar;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela_inicial);
		
		editNome = (EditText) findViewById(R.id.editNome);
        buttonJogar = (Button) findViewById(R.id.btnJogar);
        buttonJogar.setEnabled(false);
        
        
        if(editNome.getText().toString().equals("")){
        	buttonJogar.setEnabled(false);
        }
        else{
        	buttonJogar.setEnabled(true);
        }
        
        editNome.addTextChangedListener(new TextWatcher(){

			@Override
			public void afterTextChanged(Editable s) {
				
				
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				
				
			}

			@Override
			public void onTextChanged(CharSequence s, int start, int before,
					int count) {
				
				buttonJogar.setEnabled((!TextUtils.isEmpty(s.toString().trim())));
			}
        	
      	});
	}
	
	public void btnJogarOnClick(View v) {
		Intent intent = new Intent(this,Quiz1.class);
		startActivity(intent);
	}
	
	public void fechar(View botao) {
		System.exit(0);
	}
}
