/*
 * 68. Write a Java program to check whether a map contains key-value 4
 *       mappings (empty) or not.
 */
package Assign;

import java.util.HashMap;
import java.util.Map;

public class Q68 {
	public static void main(String[] args) {

		Map<Integer, String> employe = new HashMap<Integer, String>();

		employe.put(1, "Dhaval");
		employe.put(2, "Parth");
		employe.put(3, "Vinit");

		System.out.println(employe);
		
		//employe.clear();

		if (employe.isEmpty()) {
			System.out.println("Not Found Element.....");

		} else {
			System.out.println("Element here...");
		}

	}
}

