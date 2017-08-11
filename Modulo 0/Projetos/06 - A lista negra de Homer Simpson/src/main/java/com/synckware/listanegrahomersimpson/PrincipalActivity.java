package com.synckware.listanegrahomersimpson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {

    //2º Passo
    ListView lista;
    //3º Passo
    String nomes[] = {"Vovô Simpson","Gravidade","Darwin","Maria","Matt Groening"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        //4º Passo
        lista = (ListView) findViewById(R.id.lista);
        //5º Passo
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                PrincipalActivity.this, android.R.layout.simple_list_item_1, nomes);
        //6º Passo
        lista.setAdapter(adapter);

        //Clique simples na Lista
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicao, long l) {
                Toast.makeText(PrincipalActivity.this, "Click Simples: Pessoa: "+nomes[posicao], Toast.LENGTH_SHORT).show();
            }
        });
        //Clique Longo
        lista.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int posicao, long l) {
                Toast.makeText(PrincipalActivity.this, "Click Longo: Pessoa: "+nomes[posicao], Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
