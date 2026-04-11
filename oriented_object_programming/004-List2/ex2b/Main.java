package oriented_object_programming.lista2_poo.ex2b;

public class Main {
    public static void main(String[] args) {

        Rica rica = new Rica("Carlos", 30, 10000);
        rica.fazCompras();

        Pobre pobre = new Pobre("João", 25);
        pobre.trabalha();

        Miseravel miseravel = new Miseravel("Maria", 40);
        miseravel.mendiga();
    }
}