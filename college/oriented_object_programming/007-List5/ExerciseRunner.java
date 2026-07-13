package oriented_object_programming.lista5_poo;

import java.util.*;

public class ExerciseRunner {

    // 1
    public void exercise1() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list1);
        System.out.println("Ex 1 - List 1: " + list1 + " | List 2: " + list2);
    }

    // 2
    public void exercise2() {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> l2 = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> l3 = new ArrayList<>();
        for(int i = 0; i < 5; i++) l3.add(l1.get(i) + l2.get(i));
        System.out.println("Ex 2 - Sum: " + l3);
    }

    // 3
    public void exercise3() {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(4, 5, 6);
        List<Integer> l3 = new ArrayList<>(l1);
        l3.addAll(l2);
        System.out.println("Ex 3 - Union: " + l3);
    }

    // 4
    public void exercise4() {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=20; i++) list.add(i);
        System.out.println("Original: " + list);
        Collections.reverse(list);
        System.out.println("Reversed: " + list);
    }

    // 5
    public void exercise5() {
        Scanner sc = new Scanner(System.in);
        List<Float> list = new ArrayList<>();
        System.out.println("Enter 10 float numbers:");
        for(int i=0; i<10; i++) list.add(sc.nextFloat());
        System.out.println("Max: " + Collections.max(list) + " | Min: " + Collections.min(list));
    }

    // 6
    public void exercise6() {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter 10 integers:");
        for(int i=0; i<10; i++) list.add(sc.nextInt());
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted Inverse: " + list);
    }
}