/*
 * 2. Write a Java program that takes the user to provide a single character from the alphabet.
 * 	  Print Vowel or Consonant, depending on the user input. If the user input is not a letter 
 *    (between a and z or A and Z), or is a string of length > 1, print an error message.
 */
package Assign;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        String input = sc.next().toLowerCase(); 

        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Error: Please enter a single letter.");
        } else {
            char ch = input.charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        }
    }
}
