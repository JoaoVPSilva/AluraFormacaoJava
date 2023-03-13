public class TesteReferencia {

    public static void main(String[] args)
    {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("saldo da primeira : " + primeiraConta.saldo);

        //tbm referencia para um mesmo objeto, se mmudar 1 muda a outra tbm
        Conta segundaConta = primeiraConta;
    }

}
