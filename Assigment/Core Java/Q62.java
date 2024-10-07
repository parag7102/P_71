/*
 * 62. Write a Java program to extract a portion of an array list.
 */
package Assign;

import java.util.ArrayList;

public class Q62 {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();

		num.add(27);
		num.add(48);
		num.add(57);
		num.add(81);
		num.add(15);
		num.add(97);

		System.out.println("Numbers:" + num);

		System.out.println("extract a portion of:" + num.subList(2, 4));
	}
}

