import java.sql.SQLOutput;

public class CriaConta
{
    public static void main(String[] args)
    {
        Conta primeiraConta =  new Conta();
        primeiraConta.saldo = 500;

        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();

        //os atributos vem com o valor default como "0" ou false, ou referentes
        //é possivel definir uma valor padrão dentro da classe
        System.out.println(primeiraConta.numero);

        primeiraConta.numero = 132;
        System.out.println("agora o valor da primeira conta está: " + primeiraConta.numero);




    }
}