package br.com.alura.model;

public class Aluno {

    private String nome;
    private int ra;

    public Aluno(String nome, int ra) {
        this.nome = nome;
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public int getRa() {
        return ra;
    }

    @Override
    public String toString() {
        return "[Aluno: " + this.nome + ", Matricula: " + this.ra + "]";
    }
}
