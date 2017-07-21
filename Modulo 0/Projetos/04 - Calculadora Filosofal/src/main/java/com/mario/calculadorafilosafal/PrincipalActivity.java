package com.mario.calculadorafilosafal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {
    EditText txtNumero1;
    EditText txtNumero2;
    Button btnSomar;
    Button btnSubtrair;
    Button btnMult;
    Button btnDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txtNumero1 = (EditText) findViewById(R.id.txtNumero1);
        txtNumero2 = (EditText) findViewById(R.id.txtNumero2);

        btnSomar = (Button) findViewById(R.id.btnSomar);
        btnSubtrair = (Button) findViewById(R.id.btnSubtrair);
        btnMult = (Button) findViewById(R.id.btnMultiplicacao);
        btnDividir = (Button) findViewById(R.id.btnDivisao);

        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero1 = 0;
                int numero2 = 0;
                int resultadoSoma = 0;

                numero1 = Integer.parseInt(txtNumero1.getText().toString());
                numero2 = Integer.parseInt(txtNumero2.getText().toString());

                resultadoSoma = numero1 + numero2;

                Toast.makeText(getApplicationContext(),"Soma: "+resultadoSoma,Toast.LENGTH_SHORT).show();
            }
        });
        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero1 = 0;
                int numero2 = 0;
                int resultadoSoma = 0;

                numero1 = Integer.parseInt(txtNumero1.getText().toString());
                numero2 = Integer.parseInt(txtNumero2.getText().toString());

                resultadoSoma = numero1 - numero2;

                Toast.makeText(getApplicationContext(),"Subtração: "+resultadoSoma,Toast.LENGTH_SHORT).show();
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero1 = 0;
                int numero2 = 0;
                int resultadoSoma = 0;

                numero1 = Integer.parseInt(txtNumero1.getText().toString());
                numero2 = Integer.parseInt(txtNumero2.getText().toString());

                resultadoSoma = numero1 * numero2;

                Toast.makeText(getApplicationContext(),"Mult: "+resultadoSoma,Toast.LENGTH_SHORT).show();
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero1 = 0;
                int numero2 = 0;
                int resultadoSoma = 0;

                numero1 = Integer.parseInt(txtNumero1.getText().toString());
                numero2 = Integer.parseInt(txtNumero2.getText().toString());

                if(numero2 == 0){
                    Toast.makeText(getApplicationContext(), "Divisão por zero!", Toast.LENGTH_SHORT).show();
                }else{
                    resultadoSoma = numero1 / numero2;

                    Toast.makeText(getApplicationContext(),"Divisao: "+resultadoSoma,Toast.LENGTH_SHORT).show();

                }

               }
        });
    }
}
