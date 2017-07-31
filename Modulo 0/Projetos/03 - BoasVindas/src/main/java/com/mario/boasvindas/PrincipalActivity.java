package com.mario.boasvindas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {
    EditText txtNome;
    Button btnClique;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txtNome = (EditText) findViewById(R.id.txtEntrada);
        btnClique = (Button) findViewById(R.id.btnEntrar);

        btnClique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = txtNome.getText().toString();
                //Contexto - Texto - Tempo de Duracao - .show
                Toast.makeText(getApplicationContext(), "Seja bem vindo "+nome, Toast.LENGTH_LONG).show();
            }
        });
    }
}
