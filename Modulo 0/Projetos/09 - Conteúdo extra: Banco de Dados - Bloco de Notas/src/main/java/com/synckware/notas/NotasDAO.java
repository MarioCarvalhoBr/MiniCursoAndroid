package com.synckware.notas;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carvalho on 10/08/17.
 */

public class NotasDAO {
    private DatabaseOpenHelper dbHelper;
    private Context context;

    public NotasDAO(Context context) {
        dbHelper = new DatabaseOpenHelper(context);
        this.context = context;
    }

    public void add(Nota nota){
        ContentValues valores = new ContentValues();
        valores.put(DatabaseOpenHelper.TABLE_NOTAS_COLUMN_NOTA,nota.getNota());

        // Instancia uma conexão com o banco de dados, em modo de gravação
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        //Execuçao do SQL inserir
        int idInserido = (int) db.insert(DatabaseOpenHelper.TABLE_NOTAS,null,valores);

        if(idInserido != -1){
            Log.e("TAG","Inserido com sucesso!");
        }else{
            Log.e("TAG","Erro ao inserir!");
        }
        //Fecha a conexao com banco de dados
        db.close();

    }

    public void update(Nota nota){
        ContentValues valores = new ContentValues();
        valores.put(DatabaseOpenHelper.TABLE_NOTAS_COLUMN_ID,nota.getId());
        valores.put(DatabaseOpenHelper.TABLE_NOTAS_COLUMN_NOTA,nota.getNota());

        // Instancia uma conexão com o banco de dados, em modo de gravação
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        //Execuçao do SQL atualizar
        int idInserido = (int) db.update(DatabaseOpenHelper.TABLE_NOTAS, valores, DatabaseOpenHelper.TABLE_NOTAS_COLUMN_ID +"=?", new String[]{String.valueOf(nota.getId())});

        if(idInserido != -1){
            Log.e("TAG","Atualizado com sucesso!");
        }else{
            Log.e("TAG","Erro ao atualizar!");
        }
        //Fecha a conexao com banco de dados
        db.close();

    }
    public void delete(Nota nota){
        // Instancia uma conexão com o banco de dados, em modo de gravação
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        //Execuçao do SQL inserir
        int idInserido = (int) db.delete(DatabaseOpenHelper.TABLE_NOTAS, DatabaseOpenHelper.TABLE_NOTAS_COLUMN_ID +"=?", new String[]{String.valueOf(nota.getId())});

        if(idInserido != -1){
            Log.e("TAG","Deletado com sucesso!");
        }else{
            Log.e("TAG","Erro ao deletar!");
        }
        //Fecha a conexao com banco de dados
        db.close();

    }

    public List<Nota> getAll(){
        // Cria um List guardar os pessoas consultados no banco de dados
        ArrayList<Nota> notas = new ArrayList<Nota>();
        Nota nota = null;

        // Instancia uma nova conexão com o banco de dados em modo leitura
        SQLiteDatabase db =dbHelper.getReadableDatabase();

        // Executa a consulta no banco de dados
        Cursor cursor = db.query(DatabaseOpenHelper.TABLE_NOTAS, null ,null, null, null, null, DatabaseOpenHelper.TABLE_NOTAS_COLUMN_ID +" ASC");
                //db.rawQuery("SELECT * FROM notas;",null);
        /**
         * Percorre o Cursor, injetando os dados consultados em um objeto definido do
         * tipo {@link Nota} e adicionando-os na List
         */
        try{
            while (cursor.moveToNext()){
                nota = new Nota();
                nota.setId(cursor.getInt(cursor.getColumnIndex(DatabaseOpenHelper.TABLE_NOTAS_COLUMN_ID)));
                nota.setNota(cursor.getString(cursor.getColumnIndex(DatabaseOpenHelper.TABLE_NOTAS_COLUMN_NOTA)));

                notas.add(nota);
            }
        }finally {
            // Encerra o Cursor
            cursor.close();
        }
        // Encerra o a conexao com banco de dados
        db.close();
        //retorno a lista
        return notas;
    }

    public Nota getNote(int id){
        Nota nota = null;

        // Instancia uma nova conexão com o banco de dados em modo leitura
        SQLiteDatabase db = dbHelper.getReadableDatabase();

        // Executa a consulta no banco de dados
        Cursor cursor = db.query(DatabaseOpenHelper.TABLE_NOTAS, null ,DatabaseOpenHelper.TABLE_NOTAS_COLUMN_ID+"=?", new String[]{String.valueOf(id)}, null, null, DatabaseOpenHelper.TABLE_NOTAS_COLUMN_ID +" ASC");
        //db.rawQuery("SELECT * FROM notas;",null);
        /**
         * Percorre o Cursor, injetando os dados consultados em um objeto definido do
         * tipo {@link Nota} e adicionando-os na List
         */
        try{
            while (cursor.moveToNext()){
                nota = new Nota();
                nota.setId(cursor.getInt(cursor.getColumnIndex(DatabaseOpenHelper.TABLE_NOTAS_COLUMN_ID)));
                nota.setNota(cursor.getString(cursor.getColumnIndex(DatabaseOpenHelper.TABLE_NOTAS_COLUMN_NOTA)));
            }
        }finally {
            // Encerra o Cursor
            cursor.close();
        }
        // Encerra o a conexao com banco de dados
        db.close();
        //retorno a lista
        return nota;
    }

}
