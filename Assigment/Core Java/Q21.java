/*
 * 21. Create a class to print an integer and a character with two methods 
 *       having the same name but different sequence of the integer and 
 *       the character parameters. For example, 
 *       if the parameters of the first method are of the form (int n, char c), 
 *       then that of the second method will be of the form (char c, int n).
 */
package Assign;

public class Q21 {
	    public void print(int n, char c) {
	        System.out.println("Printing int and char: " + n + " " + c);
	    }

	    public void print(char c, int n) {
	        System.out.println("Printing char and int: " + c + " " + n);
	    }

	    public static void main(String[] args) {
	       Q21 pc = new Q21();
	        pc.print(10, 'a'); // int and char
	        pc.print('a', 10); // char and int
	    }
	
}
