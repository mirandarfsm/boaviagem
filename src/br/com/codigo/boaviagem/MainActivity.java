package br.com.codigo.boaviagem;

import android.app.Activity;
import android.content.Intent;
import android.graphics.DashPathEffect;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	private EditText usuario;
	private EditText senha;

	public void entrarOnClick(View v){

		String usuarioInformado = usuario.getText().toString();
		String senhaInformado = senha.getText().toString();
		
		if("teste".equals(usuarioInformado) && "".equals(senhaInformado)){
			startActivity(new Intent(this,DashboardActivity.class));
		}
		else{
			String mensagemErro = getString(R.string.erro_autenticacao);
			Toast toast = Toast.makeText(this, mensagemErro, Toast.LENGTH_SHORT);
			toast.show();
		}
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		usuario = (EditText) findViewById(R.id.usuario);
		senha = (EditText) findViewById(R.id.senha);

	}
	
}
