/*
 * 48. Write a Java program to insert an element into the array list at the first position.
 */
package Assign;
import java.util.ArrayList;
public class Q48 {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();

        
        list.add("Parth");
        list.add("Vinit");
        list.add("Yash");

        System.out.println("Before insertion: " + list);

        // Insert an element at the first position
        list.add(0, "Parag");

        System.out.println("After insertion: " + list);
    }
}
