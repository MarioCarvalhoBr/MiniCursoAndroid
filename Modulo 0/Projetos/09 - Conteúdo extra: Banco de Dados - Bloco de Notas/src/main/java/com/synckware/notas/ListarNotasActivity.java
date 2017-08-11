package com.synckware.notas;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListarNotasActivity extends AppCompatActivity {
    ListView lista;
    NotasDAO DAO;
    List<Nota> mListaDeNotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_notas);

        lista = (ListView) findViewById(R.id.lista);

        DAO = new NotasDAO(ListarNotasActivity.this);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Nota nota = (Nota) getListaNotas().getItemAtPosition(i);
                Nota nota = mListaDeNotas.get(i);
                String sms = "ID: "+nota.getId()+"\n" +
                        ""+nota.getNota();

                AlertDialog.Builder janela = new AlertDialog.Builder(ListarNotasActivity.this);
                janela.setTitle("Nota");
                janela.setMessage(sms);
                janela.setNeutralButton("OK", null);
                janela.create().show();
            }
        });

        lista.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, final int position, long l) {

                final CharSequence[] options = {"Editar", "Excluír"};

                final AlertDialog.Builder builder = new AlertDialog.Builder(ListarNotasActivity.this);
                builder.setTitle("Opcoes");
                builder.setItems(options, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int item) {
                        final Nota mNotaSelecionada = mListaDeNotas.get(position);

                        if (item == 0) {
                            Intent intent = new Intent(ListarNotasActivity.this, AddOrUpdateNotaActivity.class);
                            intent.putExtra(DatabaseOpenHelper.TABLE_NOTAS_COLUMN_ID, mNotaSelecionada.getId());
                            startActivity(intent);

                        } else if (item == 1) {
                            AlertDialog.Builder janela = new AlertDialog.Builder(ListarNotasActivity.this);
                            janela.setTitle("Aviso");
                            janela.setMessage("Deseja apagar?");
                            janela.setNeutralButton("Nao", null);
                            janela.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {

                                    DAO.delete(mNotaSelecionada);

                                    dialog.dismiss();
                                    onResume();
                                }
                            });
                            janela.create().show();

                        }
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();

                return true;
            }
        });//FIm da interface

    }

   public ListView getListaNotas() {
        return lista;
    }

    @Override
    protected void onResume(){
        super.onResume();

        mListaDeNotas = DAO.getAll();

        final ArrayAdapter<Nota> adapter = new NotasAdapter(ListarNotasActivity.this, android.R.layout.simple_list_item_1, mListaDeNotas);
        lista.setAdapter(adapter);
    }
}
