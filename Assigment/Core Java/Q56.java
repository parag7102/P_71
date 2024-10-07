/*
 * 56. Write a Java program to append the specified element to the 
 * 		  end of a hash set.
 */
package Assign;
import java.util.HashSet;
public class Q56 {
	public static void main(String[] args) {
		HashSet <String> color = new HashSet<>();
		color.add("Yellow");
		color.add("Pink");
		color.add("Black");
		color.add("Green");
		
		System.out.println(color);
		
		//Append
		String newelement="Red";
		
		color.add(newelement);
		
		System.out.println(color);
	}

}
