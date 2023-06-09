package bytebank.util;

import bytebank.modelo.Conta;
import bytebank.modelo.ContaCorrente;
import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {

        //Generics
        ArrayList<Conta> lista = new ArrayList();

        Conta cc = new ContaCorrente(22,11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22,22);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22,22);
//        lista.add(cc3);

        boolean existe = lista.contains(cc3);

        System.out.println("Já existe: " + existe);

        for(Conta conta : lista){
            if(conta == cc3){
                System.out.println("Já tenho essa");
            }
        }


//        for(Conta conta : lista){
//            System.out.println(conta);
//        }




    }

}

