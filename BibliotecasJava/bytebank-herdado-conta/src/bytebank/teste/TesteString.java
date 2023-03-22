package bytebank.teste;

public class TesteString {

    public static void main(String[] args) {

        //unico objeto que nap precisa inicializar (new)
        String nome = "Alura";
//        String outro = new String("Alura");
        //para alterar uma string, tem que criar uma nova
        //string são imutaveis
        String nome2 = nome.replace("A","a");

        nome.replace("A","a");
        System.out.println(nome);
        System.out.println(nome2);

        
    }


}
