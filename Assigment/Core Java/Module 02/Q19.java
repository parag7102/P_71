/*
 * 19. W.A.J.P to find the second most frequent character in a given string.
 *  The given string is: 
 * successes The second most frequent char in the string is: c
 */
package Assign;

import java.util.HashMap;
import java.util.Map;

public class Q19 {
	    public static void main(String[] args) {
	        String str = "successes";
	        System.out.println("Second most frequent character: " + secondMostFrequentChar(str));
	    }

	    public static Character secondMostFrequentChar(String str) {
	        Map<Character, Integer> charFreq = new HashMap<>();

	        // Count frequency of each character
	        for (char c : str.toCharArray()) {
	            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
	        }

	        // Find the second most frequent character
	        int maxFreq = 0;
	        int secondMaxFreq = 0;
	        char secondMostFreqChar = 0;

	        for (Map.Entry<Character, Integer> entry : charFreq.entrySet()) {
	            if (entry.getValue() > maxFreq) {
	                secondMaxFreq = maxFreq;
	                maxFreq = entry.getValue();
	                secondMostFreqChar = entry.getKey();
	            } else if (entry.getValue() > secondMaxFreq && entry.getValue() != maxFreq) {
	                secondMaxFreq = entry.getValue();
	                secondMostFreqChar = entry.getKey();
	            }
	        }

	        return secondMostFreqChar;
	    }
}
