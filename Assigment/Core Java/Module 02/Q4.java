/*
 * 4. Write a program in Java to input 5 numbers
 *     from keyboard and find their sum and average using for loop.
 */
package Assign;
import java.util.Scanner;
public class Q4 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int sum = 0;
	        for(int i = 0; i < 5; i++) {
	            System.out.println("Enter number " + (i+1) + ":");
	            int number = scanner.nextInt();
	            sum += number;
	        }
	        double average = (double) sum / 5;
	        System.out.println("The sum is: " + sum);
	        System.out.println("The average is: " + average);
	    }
	
}
