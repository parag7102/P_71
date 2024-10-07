/*
 * 61. Write a Java program to reverse elements in an array list.
 */
package Assign;

import java.util.ArrayList;
import java.util.Collections;

public class Q61 {

	public static void main(String[] args) {

		ArrayList<Integer> num = new ArrayList<Integer>();

		num.add(25);
		num.add(49);
		num.add(67);
		num.add(87);
		num.add(17);
		num.add(93);

		System.out.println("Numbers:" + num);
		
		Collections.reverse(num);
		
		System.out.println("Reverse Order:"+num);

	}
}
