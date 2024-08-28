/*
 * 13. W.A.J.P to get the character at the given index within the String. 
 *       Original String = Tops Technologies! The character at position 0 is T,
 *       The character at position 10 is o
 */
package Assign;

public class Q13 {
	    public static void main(String[] args) {
	        String originalString = "Tops Technologies!";
	        int index1 = 0;
	        int index2 = 10;
	        
	        if(index1 >= 0 && index1 < originalString.length()) {
	            System.out.println("The character at position " + index1 + " is " + originalString.charAt(index1));
	        }
	        else {
	            System.out.println("Invalid index1");
	        }
	        
	        if(index2 >= 0 && index2 < originalString.length()) {
	            System.out.println("The character at position " + index2 + " is " + originalString.charAt(index2));
	        }
	        else {
	            System.out.println("Invalid index2");
	        }
	    }
	
}
