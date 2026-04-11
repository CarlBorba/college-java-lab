package oriented_object_programming.lista2_poo.ex2;

public class Main {
    public static void main(String[] args) {

        Cachorro dog = new Cachorro("Rex", "Vira-lata");
        Gato cat = new Gato("Mimi", "Siames");

        System.out.println(dog.caminha());
        System.out.println(dog.late());

        System.out.println(cat.caminha());
        System.out.println(cat.mia());
    }
}