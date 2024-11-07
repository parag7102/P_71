/*
 * 53. Write a Java program to sort a given array list.
 */
package Assign;

import java.util.ArrayList;
import java.util.Collections;

public class Q53 {

	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("White");
		color.add("Blue");
		color.add("Pink");
		color.add("Orange");

		System.out.println("Before Sort :" + color);

		Collections.sort(color);

		System.out.println("After Sort :" + color);
	}
}
