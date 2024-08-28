/*
 * 11. Write a Java program to display the system time.
 */
package Assign;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Q11 {
	    public static void main(String[] args) {
	        LocalTime currentTime = LocalTime.now();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	        String formattedTime = currentTime.format(formatter);
	        System.out.println("Current Time: " + formattedTime);
	    }
	
}
