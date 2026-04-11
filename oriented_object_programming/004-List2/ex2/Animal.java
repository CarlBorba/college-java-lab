package oriented_object_programming.lista2_poo.ex2;

public class Animal {
    protected String nome;
    protected String raca;

    // Construtor vazio
    public Animal() {}

    // Construtor com nome
    public Animal(String nome) {
        this.nome = nome;
    }

    // Método caminhar
    public String caminha() {
        return "O animal está caminhando";
    }
}