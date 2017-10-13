package com.example.juanprogramador.video6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalheActivity extends AppCompatActivity {

    public static final String ANIMAL_SELECIONADO = "AnimalSelecionado";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        Animal animal = (Animal)getIntent().getSerializableExtra("AnimalSelecionado");
        TextView texto = (TextView)findViewById(R.id.textView);
        texto.setText(animal.toString());
    }
}
