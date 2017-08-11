package com.synckware.afinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DetalheActivity extends AppCompatActivity {

    TextView txtPessoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        txtPessoa = (TextView) findViewById(R.id.txtPessoa);
        
        Bundle dado = getIntent().getExtras();
        String pessoa = dado.getString("pessoa");

        txtPessoa.setText("Parabens: "+pessoa);

    }
}
