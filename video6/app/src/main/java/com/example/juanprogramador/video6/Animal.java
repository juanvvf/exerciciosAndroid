package com.example.juanprogramador.video6;

import java.io.Serializable;

/**
 * Created by Juan Programador on 10/10/2017.
 */

public class Animal implements Serializable{
    String nome;
    String raca;
    int genero;

    public Animal(String nome, String raca, int genero) {
        this.nome = nome;
        this.raca = raca;
        this.genero = genero;
    }

    public String toString(){
        return nome+", "+raca+" / "+(genero == 1 ? "Macho" : "Femea");
    }
}
