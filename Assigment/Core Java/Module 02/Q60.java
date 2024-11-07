/*
 * 60. Write a Java program to count the number of key-value (size) mappings in a map.
 */
package Assign;

import java.util.HashMap;
import java.util.Map;

public class Q60 {

	public static void main(String[] args) {

		Map<Integer, String> list =new HashMap<Integer, String>();

		list.put(1, "Parag");
		list.put(2, "Mayank");
		list.put(3, "Yash");
		list.put(4, "Vinit");
		list.put(5, "Darsh");

		int mapSize = list.size();

		System.out.println("Key And Value Size:" + mapSize);

	}
}
