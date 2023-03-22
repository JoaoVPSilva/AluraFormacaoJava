package bytebank.teste;

import bytebank.modelo.ContaCorrente;

public class TesteArryReferencias {

    public static void main(String[] args) {

//        int[] idade = new idade[5];
        Object[] referencias= new Object[5];

        System.out.println(referencias.length);

        ContaCorrente cc1 = new ContaCorrente(22,11);
        referencias[0] = cc1;



    }

}
