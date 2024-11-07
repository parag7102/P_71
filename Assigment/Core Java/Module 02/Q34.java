/*
 * 34. W.A.J. P to demonstrate try catch block,
 */
package Assign;

public class Q34 {

	    public static void main(String[] args) {
	        try {
	            int[] numbers = {1, 2, 3};
	            System.out.println(numbers[4]); 
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        }
	        System.out.println("Hi Parag, Makwana is Error.");
	    }
	
}
