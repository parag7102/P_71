/*
 * 71. Write a Java program to print all the elements of an 
 *       Array List using the position of the elements.
 */
package Assign;

import java.util.ArrayList;

public class Q71 {
	public static void main(String[] args) {

		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("White");
		color.add("Blue");
		color.add("Pink");
		color.add("Silver");

		for (int i = 0; i < color.size(); i++) {
			System.out.println("Color " + i + " : " + color.get(i));
		}

	}
}

