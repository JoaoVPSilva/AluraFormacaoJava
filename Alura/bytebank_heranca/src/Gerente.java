//Gerente herda da classe funcionario
public class Gerente extends Funcionario implements Autenticavel {

    private final AutenticacaoUtil autenticador;

    public Gerente(){
        this.autenticador = new AutenticacaoUtil();
    }
    
    //reescrita = caracteristica de assinatura, guardar os mesmos parametros.
    public double getBonificacao(){

        System.out.println("Chamando o meotodo de bonificacao do Gerente");
        return super.getSalario();
        //super funciona igual this, mas referencia a
        //uma classe superior
    }
    

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
