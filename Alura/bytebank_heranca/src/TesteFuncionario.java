public class TesteFuncionario {

    public static void main(String[] args) {


        Cliente cliente = new Cliente();


        Gerente nico = new Gerente();

        nico.setNome("Nico");
        nico.setCpf("12355323554");
        nico.setSalario(2000.0);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());


    }
}
