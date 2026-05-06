package oriented_object_programming.lista5_poo;

import java.util.*;

public class Lista {
    private static List<Integer> globalList;

    public void criaLista(int size) {
        Scanner sc = new Scanner(System.in);
        globalList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value for position " + i + ": ");
            globalList.add(sc.nextInt());
        }
    }

    public void somatorio() {
        int sum = 0;
        for (int n : globalList) sum += n;
        System.out.println("Sum: " + sum);
    }

    public void media() {
        double avg = globalList.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Average: " + avg);
    }

    public int obtemElementoLista(int pos) { return globalList.get(pos); }

    public void insereElementoLista(int pos, int val) { globalList.add(pos, val); }

    public void substituiImparPorZero() {
        for (int i = 0; i < globalList.size(); i++) {
            if (globalList.get(i) % 2 != 0) globalList.set(i, 0);
        }
    }

    public void maiorElemento() { System.out.println("Max: " + Collections.max(globalList)); }

    public void menorElemento() { System.out.println("Min: " + Collections.min(globalList)); }

    public void imprimeLista() { System.out.println("List: " + globalList); }
}