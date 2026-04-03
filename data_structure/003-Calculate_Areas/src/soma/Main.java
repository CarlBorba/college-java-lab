package soma;

import java.util.Scanner;

public class Main{
   public static void main(String[] args){
      Scanner read=new Scanner(System.in);
      int n1, n2, n3;

      System.out.println("Digite primeiro numero: ");
      n1 = read.nextInt();

      System.out.println("Digite o segundo numero: ");
      n2 = read.nextInt();

      System.out.println("Digite o terceiro numero: ");
      n3 = read.nextInt();

      Soma soma = new Soma(n1, n2, n3);
      soma.imprimirResultadoDois();
      soma.imprimirResultadoTres();
   }
}