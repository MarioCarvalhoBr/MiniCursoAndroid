package com.synckware.notas;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by carvalho on 10/08/17.
 */

public class DatabaseOpenHelper extends SQLiteOpenHelper {
    //Referente ao banco
    private static final String NOME_DO_BANCO = "bloco_de_notas.db";
    private static final int VERSAO_DO_BANCO = 5;

    //Referente a tabela
    public static final String TABLE_NOTAS = "notas";
    public static final String TABLE_NOTAS_COLUMN_ID = "_id" ;
    public static final String TABLE_NOTAS_COLUMN_NOTA = "nota";

    // SQL para criaçao da tablea
    private static final String SQL_CREATE_TABLE_NOTAS = " create table "
            + TABLE_NOTAS + " ( "
            + TABLE_NOTAS_COLUMN_ID + " integer primary key autoincrement , "
            + TABLE_NOTAS_COLUMN_NOTA + " text not null ) ; " ;
    
    public DatabaseOpenHelper(Context context) {
        super(context,NOME_DO_BANCO, null, VERSAO_DO_BANCO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_TABLE_NOTAS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versaoAntiga, int versaoNova) {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NOTAS) ;
        onCreate(db);
    }
}