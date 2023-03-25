package br.com.alura.teste;

import br.com.alura.model.Aluno;
import br.com.alura.model.Aula;
import br.com.alura.model.Curso;

public class TesteCursoComAluno {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleçoes do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando em Colecoes", 24));


        Aluno a1 = new Aluno("Rodrigo Turini", 32451);
        Aluno a2 = new Aluno("Pedro Santos", 32412);
        Aluno a3 = new Aluno("Maricio Angelo", 32466);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);


        System.out.println("Todos os alunos matriculados");
        javaColecoes.getAlunos().forEach(a ->{
            System.out.println(a);
        });


        System.out.println("O aluno " + a1 + "está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));

        






    }

}
