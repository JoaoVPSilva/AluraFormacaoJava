public class TesteMetodos {

    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(50);
        //System.out.println(conta.saldo);
        //se retorna um valor, você pode ou nao adicionar esse valor em uma variável
        boolean consegiuRetirar = contaDoPaulo.saca(20);

        //System.out.println(conta.saldo);
        //System.out.println(consegiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);


        //pode usar um if aqui, pois é um boolean e retorna um valor
        if(contaDaMarcela.transfere(300, contaDoPaulo)){
            System.out.println("Transferencia com sucesso");
        }else{
            System.out.println("Saldo insuficiente");
        }

        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoPaulo.saldo);

        contaDoPaulo.titular = "Paulo Silveira";
        System.out.println(contaDoPaulo.titular);

    }
}
