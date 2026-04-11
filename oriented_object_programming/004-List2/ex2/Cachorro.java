package oriented_object_programming.lista2_poo.ex2;

public class Cachorro extends Animal {

    public Cachorro(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    public String late() {
        return "Au au!";
    }
}