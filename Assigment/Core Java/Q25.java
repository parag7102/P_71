/*
 * 25. Create a class named 'Rectangle' with two data members 'length' 
 *       and 'breadth' and two methods to print the area and perimeter 
 *       of the rectangle respectively. Its constructor having parameters 
 *       for length and breadth is used to initialize the length and breadth 
 *       of the rectangle. Let class 'Square' inherit the 'Rectangle' class with 
 *       its constructor having a parameter for its side (suppose s) calling the 
 *       constructor of its parent class as 'super (s, s)'. Print the area and 
 *       perimeter of a rectangle and a square.
 */
package Assign;


class Rectangle {
    protected double length;
    protected double breadth;

    // Constructor 
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

   
    public void printArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

   
    public void printPerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}

// Child class
class Square extends Rectangle {
    // Constructor 
    public Square(double side) {
        super(side, side);
    }
}

public class Q25 {
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle(20, 7);
        rectangle.printArea();
        rectangle.printPerimeter();

       
        Square square = new Square(7);
        square.printArea();
        square.printPerimeter();
    }
}
