import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<String> lista = new ArrayList<>();

        lista.add("Carl");
        lista.add("Josh");
        lista.add("Adam");

        Collection<String> listaVIP = List.of("Jhon", "Paul");

        lista.addAll(listaVIP);

        if (lista.contains("Jhon")) {
            System.out.println("Jhon está na lista!");
        }

        System.out.println("A lista possui: " + lista.size() + " convidados.");

        System.out.println("\n Lista de convidados:");
        for (String p : lista) {
            System.out.println("- " + p);
        }

        for (Iterator<String> iterator = lista.iterator(); iterator.hasNext();){
            String element = iterator.next();

            if (element.charAt(0) == 'J') {
                iterator.remove();
            }
        }

        System.out.println("\n Lista de convidados:");
        for (String p : lista) {
            System.out.println("- " + p);
        }
    }
}
