/*
 * 27. Print the sum, difference and product of two complex numbers
 *       by creating a class named 'Complex' with separate methods for 
 *       each operation whose real and imaginary parts are entered by user.
 */
package Assign;

import java.util.Scanner;



class Complex {
    private double real;
    private double imaginary;

    // Constructor
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

  
    public void printComplex() {
        System.out.println(real + " + " + imaginary + "i");
    }

   
    public Complex add(Complex other) {
        double newReal = real + other.real;
        double newImaginary = imaginary + other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    // Method to calculate difference
    public Complex subtract(Complex other) {
        double newReal = real - other.real;
        double newImaginary = imaginary - other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    // Method to calculate product
    public Complex multiply(Complex other) {
        double newReal = real * other.real - imaginary * other.imaginary;
        double newImaginary = real * other.imaginary + imaginary * other.real;
        return new Complex(newReal, newImaginary);
    }
}
public class Q27 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Enter real part of first complex number: ");
	        double real1 = sc.nextDouble();
	        System.out.print("Enter imaginary part of first complex number: ");
	        double imaginary1 = sc.nextDouble();

	       
	        System.out.print("Enter real part of second complex number: ");
	        double real2 = sc.nextDouble();
	        System.out.print("Enter imaginary part of second complex number: ");
	        double imaginary2 = sc.nextDouble();

	       
	        Complex complex1 = new Complex(real1, imaginary1);
	        Complex complex2 = new Complex(real2, imaginary2);

	      
	        Complex sum = complex1.add(complex2);
	        System.out.println("Sum: ");
	        sum.printComplex();

	        
	        Complex difference = complex1.subtract(complex2);
	        System.out.println("Difference: ");
	        difference.printComplex();

	       
	        Complex product = complex1.multiply(complex2);
	        System.out.println("Product: ");
	        product.printComplex();
	    }
	
}
