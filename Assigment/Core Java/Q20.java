/*
 * 20. Create a class named 'Print Number' to print various numbers of different 
 *       data types  by creating different methods with the same name 'printn' having 
 *        a parameter for each data type.
 */
package Assign;

public class Q20 {
	
	    public void printn(int num) {
	        System.out.println("Printing int: " + num);
	    }

	    public void printn(double num) {
	        System.out.println("Printing double: " + num);
	    }

	    public void printn(float num) {
	        System.out.println("Printing float: " + num);
	    }

	    public void printn(long num) {
	        System.out.println("Printing long: " + num);
	    }

	    public void printn(short num) {
	        System.out.println("Printing short: " + num);
	    }

	    public static void main(String[] args) {
	        Q20 pn = new Q20();
	        pn.printn(10); // int
	        pn.printn(10.5); // double
	        pn.printn(10.5f); // float
	        pn.printn(10L); // long
	        pn.printn((short) 10); // short
	    }
	
}
