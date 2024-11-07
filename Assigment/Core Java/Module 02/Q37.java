/*
 * 37. W.A.J. P to implement the above program (pro.no-B27) using nesting 
 *      of try-catch block. try {
		try
		{//code}
		catch (Exception e)
		{//code}
		catch (Exception e)
		{//code}
 */
package Assign;

public class Q37 {
	 public static void main(String[] args) {
	        try {
	            int a[] = new int[5];
	            try {
	                a[5] = 30 / 0;
	            } catch (ArithmeticException e) {
	                System.out.println("Inner try-catch block: Divide by zero exception: " + e.getMessage());
	            }
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Outer try-catch block: Array index out of bounds exception: " + e.getMessage());
	        }
	    }
}
