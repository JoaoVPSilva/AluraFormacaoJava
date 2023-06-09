package bytebank.teste;

import bytebank.modelo.Conta;
import bytebank.modelo.ContaCorrente;
import bytebank.modelo.GuardadorDeContas;

public class TesteGuardador {

    public static void main(String[] args) {
        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente(22,11);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(22,11);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = (Conta) guardador.getReferencia(1);
        System.out.println(ref.getNumero());
    }
}
