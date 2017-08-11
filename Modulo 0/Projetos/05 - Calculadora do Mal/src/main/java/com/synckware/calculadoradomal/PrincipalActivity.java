package com.synckware.calculadoradomal;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PrincipalActivity extends AppCompatActivity {
    EditText txtNumero1;
    EditText txtNumero2;

    Button btnSomar;
    Button btnSubtrair;
    Button btnMult;
    Button btnDividir;

    int numero1;
    int numero2;
    int resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txtNumero1 = (EditText) findViewById(R.id.txtNumero1);
        txtNumero2 = (EditText) findViewById(R.id.txtNumero2);

        btnSomar = (Button) findViewById(R.id.btnSomar);
        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    numero1 = Integer.parseInt(txtNumero1.getText().toString());
                    numero2 = Integer.parseInt(txtNumero2.getText().toString());
                    resultado = numero1 + numero2;

                    AlertDialog.Builder alerta = new AlertDialog.Builder(PrincipalActivity.this);
                    alerta.setTitle("Resultado");
                    alerta.setMessage("A soma é: "+resultado);
                    alerta.setNeutralButton("Ok",null);
                    alerta.create().show();
                }catch (Exception e){
                    AlertDialog.Builder alerta = new AlertDialog.Builder(PrincipalActivity.this);
                    alerta.setTitle("Erro");
                    alerta.setMessage("Você precisa digitar os valores");
                    alerta.create().show();
                }

            }
        });
        btnSubtrair = (Button) findViewById(R.id.btnSubtrair);
        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    numero1 = Integer.parseInt(txtNumero1.getText().toString());
                    numero2 = Integer.parseInt(txtNumero2.getText().toString());
                    resultado = numero1 - numero2;

                    AlertDialog.Builder alerta = new AlertDialog.Builder(PrincipalActivity.this);
                    alerta.setTitle("Resultado");
                    alerta.setMessage("A subtração é: "+resultado);
                    alerta.create().show();
                }catch (Exception e){
                    AlertDialog.Builder alerta = new AlertDialog.Builder(PrincipalActivity.this);
                    alerta.setTitle("Erro");
                    alerta.setMessage("Você precisa digitar os valores corretamente");
                    alerta.create().show();
                }

            }
        });
        btnDividir = (Button) findViewById(R.id.btnDivisao);
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    numero1 = Integer.parseInt(txtNumero1.getText().toString());
                    numero2 = Integer.parseInt(txtNumero2.getText().toString());
                    if(numero2 == 0){
                        AlertDialog.Builder alerta = new AlertDialog.Builder(PrincipalActivity.this);
                        alerta.setTitle("Erro");
                        alerta.setMessage("Não é possível dividir por zero! ");
                        alerta.create().show();
                    }else{
                        resultado = numero1 / numero2;

                        AlertDialog.Builder alerta = new AlertDialog.Builder(PrincipalActivity.this);
                        alerta.setTitle("Resultado");
                        alerta.setMessage("A divisão é: "+resultado);
                        alerta.create().show();
                    }
                }catch (Exception e){
                    AlertDialog.Builder alerta = new AlertDialog.Builder(PrincipalActivity.this);
                    alerta.setTitle("Erro");
                    alerta.setMessage("Você precisa digitar os valores corretamente");
                    alerta.create().show();
                }


            }
        });
        btnMult = (Button) findViewById(R.id.btnMult);
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    numero1 = Integer.parseInt(txtNumero1.getText().toString());
                    numero2 = Integer.parseInt(txtNumero2.getText().toString());
                    resultado = numero1 * numero2;

                    AlertDialog.Builder alerta = new AlertDialog.Builder(PrincipalActivity.this);
                    alerta.setTitle("Resultado");
                    alerta.setMessage("A multiplicação é: "+resultado);
                    alerta.create().show();
                }catch (Exception e){
                    AlertDialog.Builder alerta = new AlertDialog.Builder(PrincipalActivity.this);
                    alerta.setTitle("Erro");
                    alerta.setMessage("Você precisa digitar os valores corretamente");
                    alerta.create().show();
                }

            }
        });



    }
}
