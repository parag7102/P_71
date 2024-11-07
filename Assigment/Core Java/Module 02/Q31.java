/*
 * 31. Write a program to print the factorial of a number by defining a method 
 *       named 'Factorial'. Factorial of any number n is represented by n! And is 
 *       equal to 1*2*3*.
*        (n-1) *n. E.g.- 4! = 1*2*3*4 = 24
		  3! = 3*2*1 = 6
	      2! = 2*1 = 2
		 Also, 1! = 1
		 0! = 0
 */
package Assign;
import java.util.Scanner;
public class Q31 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        scanner.close();

	        long factorial = Factorial(number);
	        System.out.println(number + "! = " + factorial);
	    }

	   
	    public static long Factorial(int number) {
	        if (number == 0 || number == 1) {
	            return 1;
	        } else {
	            return number * Factorial(number - 1);
	        }
	    }
	
}
