/*
 * 69. Write a Java program to increase the size of an array list.
 */
package Assign;

import java.util.ArrayList;

public class Q69 {

	public static void main(String[] args) {

		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("White");
		color.add("Blue");

		System.out.println("AarryList Before Size:" + color.size());
		System.out.println(color);

		color.ensureCapacity(6);

		color.add("Pink");
		color.add("Orange");

		System.out.println("AarryList After Size:" + color.size());
		System.out.println(color);

	}
}

