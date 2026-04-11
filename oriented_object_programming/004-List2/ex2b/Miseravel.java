package oriented_object_programming.lista2_poo.ex2b;

public class Miseravel extends Pessoa {

    public Miseravel(String nome, int idade) {
        super(nome, idade);
    }

    public void mendiga() {
        System.out.println(nome + " está mendigando.");
    }
}