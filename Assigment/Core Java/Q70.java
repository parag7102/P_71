/*
 * 70. Write a Java program to replace the second element of an Array List 
 * 		  with the specified element.
 */
package Assign;

import java.util.ArrayList;

public class Q70 {

	public static void main(String[] args) {

		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("White");
		color.add("Blue");

		System.out.println(color);

		color.set(1, "Pink");

		System.out.println(color);

	}
}

