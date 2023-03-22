package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        //Fluxo de Entrada com Arquivo

        FileInputStream fis = new FileInputStream("lorem.txt");//Criando o fluxo de arquivo (Retorna Binario)
        InputStreamReader isr = new InputStreamReader(fis); //Melhorando os dados Binarios para caracerees
        BufferedReader br = new BufferedReader(isr); //Leitura de linha por linha

        String linha = br.readLine();

        System.out.println(linha);

        br.close();

    }

}