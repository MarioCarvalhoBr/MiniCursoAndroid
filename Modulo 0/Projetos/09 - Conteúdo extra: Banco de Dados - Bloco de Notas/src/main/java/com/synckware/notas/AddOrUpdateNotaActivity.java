package com.synckware.notas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddOrUpdateNotaActivity extends AppCompatActivity {
    EditText txtNota;
    Button btnCadastrar;
    Nota nota = null;
    NotasDAO DAO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_ou_atualizar_nota);

        txtNota = (EditText)findViewById(R.id.txtNota);
        btnCadastrar = (Button) findViewById(R.id.btnCadastrar);

        DAO = new NotasDAO(AddOrUpdateNotaActivity.this);

        Bundle bundle = getIntent().getExtras();
        int id = bundle.getInt(DatabaseOpenHelper.TABLE_NOTAS_COLUMN_ID);
        Log.e("TAG","ID: "+id);
        if(id != 0){//Update
            nota = DAO.getNote(id);
            txtNota.setText(nota.getNota());
        }else{//Add
            nota = null;
        }

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nota == null){
                    add();
                }else{
                    update();
                }
            }
        });
    }

    public void add(){
        nota = new Nota();
        nota.setNota(txtNota.getText().toString());

        DAO.add(nota);

        Toast.makeText(AddOrUpdateNotaActivity.this, "Nota inserida com sucesso!", Toast.LENGTH_SHORT).show();
        finish();
    }

    public void update(){

        nota.setNota(txtNota.getText().toString());

        DAO.update(nota);

        Toast.makeText(AddOrUpdateNotaActivity.this, "Nota inserida com sucesso!", Toast.LENGTH_SHORT).show();
        finish();
    }
}
