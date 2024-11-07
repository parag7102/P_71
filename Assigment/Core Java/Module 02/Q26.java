/*
 * 26. Write a program to print the area and perimeter of a triangle having sides 
 *       of 3, 4 and 5 units by creating a class named 'Triangle' without any 
 *       parameter in its constructor.
 */
package Assign;
class Triangle {
   
    private double side1 = 3;
    private double side2 = 4;
    private double side3 = 5;

    // Constructor without parameters
    public Triangle() {}

    
    private double calculateSemiPerimeter() {
        return (side1 + side2 + side3) / 2;
    }

    
    public void printArea() {
        double semiPerimeter = calculateSemiPerimeter();
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        System.out.println("Area of Triangle: " + area);
    }

    
    public void printPerimeter() {
        double perimeter = side1 + side2 + side3;
        System.out.println("Perimeter of Triangle: " + perimeter);
    }
}
public class Q26 {
	    public static void main(String[] args) {
	       
	        Triangle triangle = new Triangle();
	        triangle.printArea();
	        triangle.printPerimeter();
	    }
	
}
