/*
 * 47. Write a Java program to iterate through all elements in an array list.
 */
package Assign;
import java.util.ArrayList;
public class Q47 {
	    public static void main(String[] args) {
	        
	        ArrayList<String> myList = new ArrayList<String>();

	        
	        myList.add("Parag");
	        myList.add("Akshay");
	        myList.add("Kiran");

	        
	        for (String element : myList) {
	            System.out.println(element);
	        }
	    }
	
}
