/*
 * 9. Write a Java program to print the ASCII value of a given character.
 */
package Assign;
import java.util.Scanner;
public class Q9 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a character: ");
	        char input = scanner.next().charAt(0);
	        int asciiValue = (int) input;
	        System.out.println("The ASCII value of '" + input + "' is: " + asciiValue);
	    }
	
}
