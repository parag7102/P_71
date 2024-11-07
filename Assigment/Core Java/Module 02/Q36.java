/*
 * 36. W.A.J. P to demonstrate multiple catch blocks, 
 * 		(one is to handle divide by zero exception and another one is to handle
		ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0;
 */
package Assign;

public class Q36 {
	public static void main(String[] args) {
        int a[] = new int[5];

        try {
            a[5] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception: " + e.getMessage());
        }
    }
}
