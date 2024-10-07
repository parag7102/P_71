/*
 * 66. • Write a Java program to convert a hash set to an array.
 */
package Assign;

import java.util.HashSet;
import java.util.Iterator;

public class Q66 {
	public static void main(String[] args) {

		HashSet<Integer> num1 = new HashSet<Integer>();

		num1.add(22);
		num1.add(44);
		num1.add(66);
		num1.add(85);
		num1.add(15);
		num1.add(93);
		System.out.println(num1);

		System.out.println("convert a hash set to an array");
		
		num1.toArray();
		
		Iterator itr=num1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	

	}
}

