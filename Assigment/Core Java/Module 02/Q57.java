/*
 * 57. Write a Java program to iterate through all elements in a hash list.
 */
package Assign;

import java.util.HashSet;
import java.util.Iterator;

public class Q57 {
	public static void main(String[] args) {

		HashSet<Integer> number = new HashSet<>();

		number.add(37);
		number.add(50);
		number.add(58);
		number.add(32);
		number.add(15);
		number.add(67);

		Iterator<Integer> itr = number.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
