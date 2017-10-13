package com.example.juanprogramador.video6;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Juan Programador on 10/10/2017.
 */

public class AnimalAdapter extends ArrayAdapter<Animal> {
    public AnimalAdapter(Context context,  List<Animal> objects) {
        super(context, 0, objects);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        //obter oo objeto da lista
        Animal animal = getItem(position);
        // carregar o arquivo Layout
        if(convertView == null){
            Log.d("juan "," View Nova "+ position);
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.itemdalista, null);

        }else { Log.d("juan "," View RECICLADA "+ position);
        }
        //preencher p layout com as informações
        TextView txtNome = (TextView) convertView.findViewById(R.id.txtNomw);
        TextView txtRaca = (TextView) convertView.findViewById(R.id.txtRaca);
        txtNome.setText(animal.nome);
        txtRaca.setText(animal.raca);
        txtNome.setTextColor(animal.genero == 1 ? Color.BLUE : Color.RED);

        //retorna a view
        //return layout;
        return convertView;
    }
}
