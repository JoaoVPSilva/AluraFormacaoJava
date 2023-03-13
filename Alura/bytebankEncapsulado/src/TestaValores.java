public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);

        //conta está inconsistente
        conta.setAgencia(-40);
        conta.setNumero(-330);

        Conta conta2 = new Conta(1337, 12356);
        Conta conta3 = new Conta(1337, 23453);

        System.out.println(Conta.getTotal());

    }



}
