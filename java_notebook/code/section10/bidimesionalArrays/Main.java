package section10.bidimesionalArrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many lines will have the matrix?");
        int m = sc.nextInt();

        System.out.println("How many lines will have the matrix?");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int[] line : matrix){
            for (int number : line){
                System.out.print("[" + number + "]");
            }
            System.out.println();
        }
    }
}
