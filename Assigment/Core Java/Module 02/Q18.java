/*
 * 18. W.A.J.P to find all interleaving of given strings. 
 *      The given strings are: WX YZ
         The interleaving strings are: YWZX WYZX YWXZ WXYZ YZWX WYXZ
 */
package Assign;

import java.util.ArrayList;
import java.util.List;

public class Q18 {
	    public static void main(String[] args) {
	        String str1 = "WX";
	        String str2 = "YZ";
	        List<String> result = new ArrayList<>();

	        interleave(str1, str2, "", result);

	        System.out.println("The interleaving strings are:");
	        for (String interleavedStr : result) {
	            System.out.println(interleavedStr);
	        }
	    }

	    public static void interleave(String str1, String str2, String current, List<String> result) {
	        if (str1.isEmpty() && str2.isEmpty()) {
	            result.add(current);
	        }

	        if (!str1.isEmpty()) {
	            interleave(str1.substring(1), str2, current + str1.charAt(0), result);
	        }

	        if (!str2.isEmpty()) {
	            interleave(str1, str2.substring(1), current + str2.charAt(0), result);
	        }
	    }
	}
