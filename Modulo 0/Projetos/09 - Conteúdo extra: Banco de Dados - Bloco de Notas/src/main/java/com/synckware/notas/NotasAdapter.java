package com.synckware.notas;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by carvalho on 10/08/17.
 */

public class NotasAdapter extends ArrayAdapter<Nota> {

    private final List<Nota> notas;
    private Activity activity;

    public NotasAdapter(Activity activity, int resource, List<Nota> notas) {
        super(activity, resource, notas);
        this.activity = activity;
        this.notas = notas;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Nota nota = notas.get(position);


        View view = activity.getLayoutInflater().inflate(
                R.layout.item_lista_notas, null);

        TextView tvId = (TextView) view.findViewById(R.id.tvId);
        tvId.setText("ID: "+nota.getId());

        TextView tvNota = (TextView) view.findViewById(R.id.tvNota);
        tvNota.setText("Nota: "+nota.getNota());

        return view;
    }

    /**
     * Retorna o ID de um determinado item da ListView, de acordo com a sua
     * posição.
     */
    @Override
    public long getItemId(int position) {
        return notas.get(position).getId();
    }

    /**
     * Retorna o número de itens que serão mostrados na ListView.
     */
    @Override
    public int getCount() {
        return notas.size();
    }

    /**
     * Retorna um determinado item da ListView, de acordo com a sua posição.
     */
    @Override
    public Nota getItem(int position) {
        return notas.get(position);
    }
}
