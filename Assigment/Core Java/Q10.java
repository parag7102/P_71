/*
 * 10. Write a Java program that accepts an integer (n) and computes 
 *       the value of n+nn+nnn. Input number: 5
          5 + 55 + 555
 */
package Assign;
import java.util.Scanner;
public class Q10 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Input number: ");
	        int n = scanner.nextInt();
	        int nn = n * 10 + n;
	        int nnn = nn * 10 + n;
	        System.out.println(n + " + " + nn + " + " + nnn + " = " + (n + nn + nnn));
	    }
	
}
