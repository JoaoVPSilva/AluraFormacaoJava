package br.com.alura.teste;

import java.util.HashSet;
import java.util.Set;

public class TestaAluno {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Rodrigo");
        alunos.add("Alberto");
        alunos.add("Nico");

        boolean paulosEstaMatriculado = alunos.contains("Paulo");
        alunos.remove("Rodrigo");
        System.out.println(paulosEstaMatriculado);

        System.out.println(alunos);

        for(String aluno : alunos){
            System.out.println(aluno);
        }

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

    }
}
