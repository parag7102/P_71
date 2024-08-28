/*
 * 33. Create a class named 'Shape' with a method to print "This is this is shape". 
 *       Then create two other classes named 'Rectangle', 'Circle' inheriting 
 *       the Shape class, both having a method to print "This is rectangular shape"
 *        and "This is circular shape" respectively. Create a subclass 'Square' of 
 *        'Rectangle' having a method to print "Square is a rectangle". 
 *        Now call the method of 'Shape' and 'Rectangle' class by the object of 
 *        'Square' class.
 */
package Assign;

class Shape1 {
    void printShape() {
        System.out.println("This is a shape");
    }
}

class Rectangle1 extends Shape1 {
    void printRectangle() {
        System.out.println("This is a rectangular shape");
    }
}

class Circle1 extends Shape1 {
    void printCircle() {
        System.out.println("This is a circular shape");
    }
}

class Square1 extends Rectangle1 {
    void printSquare() {
        System.out.println("A square is a rectangle");
    }
}

public class Q33 {
	 public static void main(String[] args) {
	        Square1 square = new Square1();
	        square.printShape(); 
	        square.printRectangle(); 
	       
	    }
}
