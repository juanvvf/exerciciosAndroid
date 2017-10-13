package com.example.juanprogramador.video6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<Animal> animal = new ArrayList<Animal>();
        for (int i = 0 ; i<50; i++) {
           animal.add(new Animal("Toby ","Dashund", 1));
           animal.add(new Animal("Morana","Dashund", 0));
            animal.add(new Animal("Zuki","Husk Siberiano", 1));
        }
        ListView listView = (ListView) findViewById(R.id.listaPessoas);

       // ArrayAdapter<Animal> adapter = new ArrayAdapter<Animal>(this, R.layout.itemdalista, animal);
        AnimalAdapter adapter = new AnimalAdapter(this, animal);
        listView.setAdapter(adapter);
        ///pegando o click na lista
       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
               //Animal animais = animal.get(position);
               Animal animais = (Animal) parent.getAdapter().getItem(position);
               if(animais.genero == 1){
                   Toast.makeText(MainActivity.this, animais.nome+" é Macho", Toast.LENGTH_SHORT).show();
               }else {
                   Toast.makeText(MainActivity.this, animais.nome+" é Femea", Toast.LENGTH_SHORT).show();
               }

               Intent it = new Intent(MainActivity.this, DetalheActivity.class);
               it.putExtra(DetalheActivity.ANIMAL_SELECIONADO, animais);
               startActivity(it);

           }
       });
    }
}
