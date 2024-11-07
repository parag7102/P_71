/*
 * 7. Write a Java program that reads a positive integer 
 * and count the number of digits the number.
	Input an integer number less than ten billion: 125463 
	Number of digits in the number: 6
 */
package Assign;
import java.util.Scanner;
public class Q7 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Input an integer number less than ten billion:");
	        long number = scanner.nextLong();
	        if(number < 0) {
	            System.out.println("The number should be positive.");
	        } else {
	            int count = 0;
	            while(number > 0) {
	                number /= 10;
	                count++;
	            }
	            System.out.println("Number of digits in the number: " + count);
	        }
	    }
	
}
