/*
 * 38. W.A.J. P to demonstrate try catch block, take two numbers from 
 * 		the user by Command line argument and perform the division operation 
 * 		and handle Arithmetic
		O/P-
		Exception in thread main java. Lang. Arithmetic Exception:/ by zero
 */
package Assign;

public class Q38 {

	    public static void main(String[] args) {
	        try {
	            int num1 = Integer.parseInt(args[0]);
	            int num2 = Integer.parseInt(args[1]);
	            int result = num1 / num2;
	            System.out.println("The result is: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: " + e.getMessage() + ". Please ensure the second number is not zero.");
	        } catch (NumberFormatException e) {
	            System.out.println("Error: Please provide two integer numbers as command line arguments.");
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: Please provide two integer numbers as command line arguments.");
	        }
	    }
	
}
