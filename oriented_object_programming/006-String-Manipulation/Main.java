package oriented_object_programming.strings_manipulation;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

//        System.out.println("Type your string:");
//        String myString = read.nextLine();
//
//        // String lenght
//        System.out.println("The syze of your string is: " + myString.length());
//
//        // Upper Case
//        System.out.println("Upper: " + myString.toUpperCase());
//
//        // Start with
//        System.out.println("Your string start with UNI? -> " + myString.startsWith("UNI"));

        // Subs the number to his names
        System.out.println("Type a int number:");
        String number = read.nextLine();
        char[] numbersVector = number.toCharArray();  // "123" -> '1', '2', '3'

        String[] numberName = {"zero", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove"};

        for(char letter : numbersVector){
            // Converting each char to integer to be used like vector position
            // Is used (+ "") just to convert the char to String to use the parseInt

            System.out.println(numberName[(letter - '0')]);
            // Another way using Integer.parseInt(String to int)
            // System.out.println(numberName[Integer.parseInt(letter + "")]);
        }

        System.out.println("Type a word to replace the numbers:");
        String word = read.nextLine();

        System.out.println("Replaced word: " + word.replaceAll("[0-9]", "*"));

    }
}
