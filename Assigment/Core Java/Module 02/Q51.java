/*
 * 51. Write a Java program to remove the third element from an array list. 
 */
package Assign;

import java.util.ArrayList;

public class Q51 {

	public static void main(String[] args) {

		ArrayList<String> color = new ArrayList<>();

		color.add("Red");
		color.add("White");
		color.add("Blue");
		color.add("Pink");

		System.out.println("Before Color:" + color);

		color.remove(3);

		System.out.println("After Change Colour:" + color);

	}
}

