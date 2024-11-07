/*
 * 6. Write a program in Java to make such a pattern 
 *     like right angle triangle with number increased by 1 The pattern like:
 */
package Assign;

public class Q6 {
	    public static void main(String[] args) {
	        int count = 1;
	        for(int i = 1; i <= 4; i++) {
	            for(int j = 1; j <= i; j++) {
	                System.out.print(count + " ");
	                count++;
	            }
	            System.out.println();
	        }
	    }
	
}
