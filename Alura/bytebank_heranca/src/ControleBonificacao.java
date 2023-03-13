public class ControleBonificacao {

    private double soma;

    public void registro(Funcionario g){
        double boni = g.getBonificacao();
        this.soma += boni;
    }



    public double getSoma() {
        return soma;
    }
}
