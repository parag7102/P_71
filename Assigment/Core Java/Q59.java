/*
 * 59. Write a Java program to associate the specified value with 
 *       the specified key in a Hash Map.
 */
package Assign;

import java.util.HashMap;

import java.util.*;

public class Q59 {
	public static void main(String[] args) {
	HashMap<Integer, String> list = new HashMap<>();
	
	list.put(1, "Parth");
	list.put(2, "Kiran");
	list.put(3, "Akshay");
	list.put(4, "Dhaval");
	list.put(5, "Jemin");
	
    for(Map.Entry x: list.entrySet()) {
    	System.out.println(x.getKey()+":"+x.getValue());
    }
}
	

	  	

}