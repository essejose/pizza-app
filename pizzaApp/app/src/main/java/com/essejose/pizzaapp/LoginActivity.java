package com.essejose.pizzaapp;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout PasswordValue;
    private TextInputLayout usuarioValue;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PasswordValue = (TextInputLayout) findViewById(R.id.PasswordValue);
        usuarioValue = (TextInputLayout) findViewById(R.id.usuarioValue);

    }

    public void clearInputError(View v){
        usuarioValue.setError(null);
        PasswordValue.setError(null);
    }
    public void login(View v) {

        Intent intencaoPedido = new Intent(LoginActivity.this,
                PedidoActivity.class);


        if(TextUtils.isEmpty(usuarioValue.getEditText().getText().toString())){

            usuarioValue.setError(getString(R.string.info_erro_vazio, "Nome"));

        }else if(TextUtils.isEmpty(PasswordValue.getEditText().getText().toString())){
            PasswordValue.setError(getString(R.string.info_erro_vazio, "Password"));

        }else{
            intencaoPedido.putExtra("NOME", usuarioValue.getEditText().getText().toString());
            startActivity(intencaoPedido);
        }



    }
}
