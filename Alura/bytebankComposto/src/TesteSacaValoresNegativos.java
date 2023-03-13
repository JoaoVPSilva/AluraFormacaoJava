public class TesteSacaValoresNegativos {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);
        System.out.println(conta.saca(200));
        //System.out.println(conta.saldo);

        //proibido !
        //conta.saldo = conta.saldo - 101;
        //nao permite pq esta privado
        //System.out.println(conta.saldo);


        System.out.println(conta.getSaldo());

    }

}

