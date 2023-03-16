public class TesteReferencias {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();

        g1.setNome("Marcos");
        g1.setSalario(5000.0);

        Funcionario f = new Gerente();
        f.setSalario(2000.0);

        EditorDeVideos ev = new EditorDeVideos();
        ev.setSalario(3000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registro(g1);
        controle.registro(f);
        controle.registro(ev);

        System.out.println(controle.getSoma());

    }
}
