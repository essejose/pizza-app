package com.essejose.pizzaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PedidoActivity extends AppCompatActivity {

    private TextView usuarioName;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);

        usuarioName = (TextView) findViewById(R.id.usuarioName);

        if (getIntent() != null) {
            String nome = getIntent().getStringExtra("NOME");

            usuarioName.setText(
                    getString(R.string.saudacao_usuario, nome)
            );

        }
    }
}
