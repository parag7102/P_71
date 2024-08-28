/*
 * 16. W.A.J.P to check whether a given string ends with the 
 *      contents of another string. "Java Exercises" ends with "se"?
 *      False "Java Exercise" ends with "se"? True
 */
package Assign;

public class Q16 {
	public static void main(String[] args) {
        String str1 = "Java Exercises";
        String str2 = "se";
        String str3 = "Java Exercise";

        // Check if str1 ends with str2
        boolean result1 = str1.endsWith(str2);
        System.out.println("\"" + str1 + "\" ends with \"" + str2 + "\": " + result1);

        // Check if str3 ends with str2
        boolean result2 = str3.endsWith(str2);
        System.out.println("\"" + str3 + "\" ends with \"" + str2 + "\": " + result2);
    }
}
