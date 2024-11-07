/*
 * 58. Write a Java program to get the number of elements in a hash set.
 */
package Assign;
import java.util.HashSet;
public class Q58 {
	public static void main(String[] args) {
		
		HashSet<Integer> number = new HashSet<>();
		
		number.add(37);
		number.add(50);
		number.add(58);
		number.add(32);
		number.add(15);
		number.add(67);
		
		System.out.println("The Number of Element in HashSet :"+number.size());
	}
}
