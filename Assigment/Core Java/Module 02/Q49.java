/*
 * 49. Write a Java program to retrieve an element (at a specified index) from a given array list.
 */
package Assign;
import java.util.ArrayList;
public class Q49 {
	    public static void main(String[] args) {
	        
	        ArrayList<String> list = new ArrayList<>();

	        
	        list.add("Java");
	        list.add("Python");
	        list.add("C++");
	        list.add("React");
	        list.add("ASP.NET");

	        System.out.println("ArrayList: " + list);

	     
	        int index = 2;

	        
	        try {
	            String element = list.get(index);
	            System.out.println("Element at index " + index + ": " + element);
	        } catch (IndexOutOfBoundsException e) {
	            System.out.println("Invalid index. Index must be between 0 and " + (list.size() - 1));
	        }
	    }

}
