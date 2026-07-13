package oriented_object_programming.lista2_poo.ex2b;

public class Pobre extends Pessoa {

    public Pobre(String nome, int idade) {
        super(nome, idade);
    }

    public void trabalha() {
        System.out.println(nome + " está trabalhando.");
    }
}