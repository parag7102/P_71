/*
 * 17. W.A.J.P to check whether a given string starts with the contents of 
 *       another string. Red is favorite color. Starts with Red? True Orange is also 
 *       my favorite color. Starts with Red? False I3.
 */
package Assign;

public class Q17 {
	 public static void main(String[] args) {
	        String str1 = "Red is favorite color.";
	        String str2 = "Red";
	        String str3 = "Orange is also my favorite color.";

	        // Check if str1 starts with str2
	        boolean result1 = str1.startsWith(str2);
	        System.out.println("\"" + str1 + "\" starts with \"" + str2 + "\": " + result1);

	        // Check if str3 starts with str2
	        boolean result2 = str3.startsWith(str2);
	        System.out.println("\"" + str3 + "\" starts with \"" + str2 + "\": " + result2);
	    }
}
