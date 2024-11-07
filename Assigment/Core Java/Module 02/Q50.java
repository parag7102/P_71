/*
 * 50. Write a Java program to update specific array element by given element.
 */
package Assign;
import java.util.ArrayList;
public class Q50 {
	public static void main(String[] args) {
	        
	        ArrayList<String> list = new ArrayList<>();

	        
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        list.add("Date");
	        list.add("Elderberry");

	        System.out.println("Before update: " + list);

	        
	        int index = 2;
	        String newElement = "Grapes";

	        
	        if (index >= 0 && index < list.size()) {
	            
	            list.set(index, newElement);
	            System.out.println("Element updated successfully.");
	        } else {
	            System.out.println("Invalid index. Index must be between 0 and " + (list.size() - 1));
	        }

	        System.out.println("After update: " + list);
	    }
	
}
