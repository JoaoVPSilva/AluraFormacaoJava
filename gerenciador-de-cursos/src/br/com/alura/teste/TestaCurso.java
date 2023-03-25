package br.com.alura.teste;

import br.com.alura.model.Aula;
import br.com.alura.model.Curso;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleçoes do Java", "Paulo Silveira");

//        List<Aula> aulas = javaColecoes.getAulas();
//        System.out.println(aulas);

//        javaColecoes.getAulas().add(new Aula("Trabalhando com Arraylist", 21));


        javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando em Colecoes", 22));

        System.out.println(javaColecoes.getAulas());



    }
}
