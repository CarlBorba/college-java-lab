package oriented_object_programming.lista2_poo.ex2b;

public class Rica extends Pessoa {
    private double dinheiro;

    public Rica(String nome, int idade, double dinheiro) {
        super(nome, idade);
        this.dinheiro = dinheiro;
    }

    public void fazCompras() {
        System.out.println(nome + " está fazendo compras!");
    }
}