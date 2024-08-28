/*
 * 3. Write a Java program that takes a year from user
 *   and print whether that year is a leap year or not. B19.
 *   Write a program in Java to display the first 10 natural numbers using while loop.
 */
package Assign;
import java.util.*;

public class Q3 {
public static void main(String[] args) {
	int year = 2024;
	boolean leap = false;
	if(year % 4 == 0) {
		if(year % 100 == 0) {
			if(year % 400 ==0) {
				leap = true;
			}else {
				leap = true;
			}
		}
		if(leap) {
			System.out.println(year + " is leap year");
		}else {
			System.out.println(year +" is not leap year");
		}
	}
}
}


