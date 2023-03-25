package br.com.alura.teste;

import br.com.alura.model.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula  {

    public static void main(String[] args) {
        Aula a1 = new Aula("Revisitando as Arraylists", 21);
        Aula a2 = new Aula("lista de objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        //ele pega automatico o "toString"
        System.out.println(aulas);

        System.out.println("--------------");

        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println("--------------");

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);

        System.out.println("--------------");

        aulas.sort(Comparator.comparing(Aula::getTempo));


    }

}
