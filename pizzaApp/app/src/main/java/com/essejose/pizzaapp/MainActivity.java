package com.essejose.pizzaapp;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout PasswordValue;
    private TextInputLayout usuarioValue;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PasswordValue = (TextInputLayout) findViewById(R.id.PasswordValue);
        usuarioValue = (TextInputLayout) findViewById(R.id.usuarioValue);

    }

    public void login(View v) {

        Intent intencaoPedido = new Intent(MainActivity.this,
                PedidoActivity.class);


        startActivity(intencaoPedido);
    }
}
