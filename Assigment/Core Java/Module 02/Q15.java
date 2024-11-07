/*
 * 15. W.A.J.P to compare a given string to the specified character sequence. 
 *       Comparing topsint.com and topsint.com:
 *       true Comparing Topsint.com and topsint.com: false
 */
package Assign;

public class Q15 {
	   public static void main(String[] args) {
	        String str1 = "(https://topsint.com/)";
	        String str2 = "(Topsint.com )";
	        String str3 = "(https://topsint.com/)";

	        // Compare str1 and str2
	        boolean result1 = str1.equals(str2);
	        System.out.println("Comparing " + str1 + " and " + str2 + ": " + result1);

	        // Compare str1 and str3
	        boolean result2 = str1.equals(str3);
	        System.out.println("Comparing " + str1 + " and " + str3 + ": " + result2);
	    }
}
