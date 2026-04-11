package oriented_object_programming.lista2_poo.ex2;

public class Gato extends Animal {

    public Gato(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    public String mia() {
        return "Miau!";
    }
}