/*
 * 55. Write a Java program to shuffle elements in an array list.
 */
package Assign;

import java.util.ArrayList;
import java.util.Collections;

public class Q55 {

	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<String>();

		color.add("Red");
		color.add("White");
		color.add("Blue");
		color.add("Pink");

		System.out.println("Color:" + color);

		Collections.shuffle(color);

		System.out.println("Suffle:" + color);
	}
}

