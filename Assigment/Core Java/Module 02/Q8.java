/*
 * 8. Write a Java program to count the letters, spaces,
 *     numbers and other characters of an input string.
 */
package Assign;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {

		String test = "Parag Makwana, I like cricket 786. Ind: Aus@@ 67.33";
		count(test);
	}

	public static void count(String input) {
		char[] characters = input.toCharArray();
		int letterCount = 0;
		int spaceCount = 0;
		int numberCount = 0;
		int otherCount = 0;

		for (char ch : characters) {
			if (Character.isLetter(ch)) {
				letterCount++;
			} else if (Character.isDigit(ch)) {
				numberCount++;
			} else if (Character.isSpaceChar(ch)) {
				spaceCount++;
			} else {
				otherCount++;
			}
		}

		System.out.println("Original string: " + input);
		System.out.println("Letter count: " + letterCount);
		System.out.println("Space count: " + spaceCount);
		System.out.println("Number count: " + numberCount);
		System.out.println("Other character count: " + otherCount);
	}

}
