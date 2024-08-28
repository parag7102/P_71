/*
 * 32. We have to calculate the area of a rectangle, a square and a circle. 
 * 		  Create an abstract class 'Shape' with three abstract methods namely 
 *       'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' 
 *       taking one parameter each. The parameters of 'RectangleArea' are its 
 *       length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' 
 *       is its radius. Now create another class 'Area' containing all the three methods 
 *       'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle,
 *        square and circle respectively. Create an object of class 'Area' and call all the 
 *        three methods. 
 *        I3. Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
		        Marks Grade
				1-100           A
				1-90             B
				1-80             B
				1-70             C
				1-60             D
				41-50          DD
				40               Fail
 */
package Assign;
import java.util.Scanner;



abstract class Shape {
    
    public abstract double RectangleArea(double length, double breadth);

    
    public abstract double SquareArea(double side);

   
    public abstract double CircleArea(double radius);
}


class Area extends Shape {
    
    public double RectangleArea(double length, double breadth) {
        return length * breadth;
    }

   
    public double SquareArea(double side) {
        return side * side;
    }

    
    public double CircleArea(double radius) {
        return 3.14 * radius * radius;
    }
}
public class Q32 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        Area area = new Area();

	        
	        System.out.print("Enter length of rectangle: ");
	        double length = scanner.nextDouble();
	        System.out.print("Enter breadth of rectangle: ");
	        double breadth = scanner.nextDouble();
	      
	        System.out.println("Area of rectangle: " + area.RectangleArea(length, breadth));

	        
	        System.out.print("Enter side of square: ");
	        double side = scanner.nextDouble();
	        
	        System.out.println("Area of square: " + area.SquareArea(side));

	       
	        System.out.print("Enter radius of circle: ");
	        double radius = scanner.nextDouble();
	        
	        System.out.println("Area of circle: " + area.CircleArea(radius));

	        
	        System.out.print("Enter marks (out of 100): ");
	        int marks = scanner.nextInt();
	        scanner.close();

	        
	        if (marks >= 91 && marks <= 100) {
	            System.out.println("Grade: A");
	        } else if (marks >= 81 && marks <= 90) {
	            System.out.println("Grade: B");
	        } else if (marks >= 71 && marks <= 80) {
	            System.out.println("Grade: C");
	        } else if (marks >= 61 && marks <= 70) {
	            System.out.println("Grade: D");
	        } else if (marks >= 41 && marks <= 50) {
	            System.out.println("Grade: DD");
	        } else if (marks <= 40) {
	            System.out.println("Grade: Fail");
	        }
	    }
	

}
