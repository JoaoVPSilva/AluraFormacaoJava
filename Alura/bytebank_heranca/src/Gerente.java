//Gerente herda da classe funcionario
public class Gerente extends Funcionario{

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        }else{
            return false;
        }
    }

    //reescrita = caracteristica de assinatura, guardar os mesmos parametros.
    public double getBonificacao(){

        return super.getBonificacao() + super.getSalario();
        //super funciona igual this, mas referencia a
        //uma classe superior
    }


}
