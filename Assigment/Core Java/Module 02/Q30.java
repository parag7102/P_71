/*
 * 30. We have to calculate the percentage of marks obtained in three subjects 
 *       (each out of 100) by student 
 *       A and in four subjects (each out of 100) by student
 *       B. Create an abstract class 'Marks' with an abstract method 'getPercentage'.
 *           It is inherited by two other classes 'A' and 'B' each having a method 
 *           with the same name which returns the percentage of the students. 
 *           The constructor of student A takes the marks in three subjects as
 *            its parameters and the marks in four subjects as its parameters for 
 *            student
          B. Create an object for each of the two classes and print the percentage
              of marks for both the students.
 */
package Assign;
abstract class Marks {
    
    public abstract double getPercentage();
}

class A extends Marks {
    private double marks1;
    private double marks2;
    private double marks3;

    // Constructor 
    public A(double marks1, double marks2, double marks3) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    
    public double getPercentage() {
        return (marks1 + marks2 + marks3) / 3;
    }
}

class B extends Marks {
    private double marks1;
    private double marks2;
    private double marks3;
    private double marks4;

    // Constructor 
    public B(double marks1, double marks2, double marks3, double marks4) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.marks4 = marks4;
    }

    
    public double getPercentage() {
        return (marks1 + marks2 + marks3 + marks4) / 4;
    }
}
public class Q30 {
	    public static void main(String[] args) {
	        
	        A studentA = new A(67, 75, 80);
	       
	        System.out.println("Percentage of student A: " + studentA.getPercentage() + "%");

	       
	        B studentB = new B(60, 80, 76, 88);
	        
	        System.out.println("Percentage of student B: " + studentB.getPercentage() + "%");
	    }
	


}
