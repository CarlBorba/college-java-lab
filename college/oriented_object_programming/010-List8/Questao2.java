package oriented_object_programming.lista8_poo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int x = 0;
        int y = 0;
        double r = 0;

        System.out.println("Eu sei dividir!!");

        // Leitura do primeiro valor
        while (true) {

            try {

                System.out.print("Informe o primeiro valor: ");
                x = teclado.nextInt();
                break;

            } catch (InputMismatchException e) {

                System.out.println("Erro: Digite apenas números inteiros!");
                teclado.nextLine();

            }
        }

        // Leitura do segundo valor
        while (true) {

            try {

                System.out.print("Informe o segundo valor: ");
                y = teclado.nextInt();

                if (y == 0) {
                    throw new ArithmeticException();
                }

                break;

            } catch (InputMismatchException e) {

                System.out.println("Erro: Digite apenas números inteiros!");
                teclado.nextLine();

            } catch (ArithmeticException e) {

                System.out.println("Erro: Não existe divisão por zero!");
            }
        }

        r = (double) x / y;

        System.out.println("O resultado da divisão é " + r);

        teclado.close();
    }
}