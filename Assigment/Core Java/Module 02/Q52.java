/*
 * 52. Write a Java program to search an element in an array list.
 */
package Assign;
import java.util.ArrayList;  
import java.util.Scanner;
public class Q52 { 
	    public static void main(String[] args) {  
	         
	        ArrayList<Integer> numbers = new ArrayList<>();  
	        
	       
	        numbers.add(10);  
	        numbers.add(20);  
	        numbers.add(30);  
	        numbers.add(40);  
	        numbers.add(50);  
	        
	        
	        System.out.println("ArrayList: " + numbers);  
	        
	         
	        Scanner scanner = new Scanner(System.in);  
	        
	         
	        System.out.print("Enter a number to search: ");  
	        int searchNumber = scanner.nextInt();  
	        
	         
	        if (numbers.contains(searchNumber)) {  
	            System.out.println(searchNumber + " is found in the ArrayList.");  
	        } else {  
	            System.out.println(searchNumber + " is not found in the ArrayList.");  
	        }  
	        
	        
	        scanner.close();  
	    }  
	
}
