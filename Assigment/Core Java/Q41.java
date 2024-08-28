/*
 * 41. W.A.J.P to create a class Student with attributes roll no, name, age 
 * 		  and course. Initialize values through parameterized constructor. 
 *       If age of student is not in between 15 and 21 then generate user 
 *       defined exception "AgeNotWithinRangeException". If name contains 
 *       numbers or special symbols raise exception "NameNotValidException". 
 *       Define the two exception classes.
 */
package Assign;

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    int rollNo;
    String name;
    int age;
    String course;

    // Parameterized constructor
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age must be between 15 and 21.");
        }
        if (!name.matches("[a-zA-Z ]+")) {
            throw new NameNotValidException("Name cannot contain numbers or special symbols.");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}
public class Q41 {
	    public static void main(String[] args) {
	        try {
	            Student student = new Student(71, "Kartik", 21, "MCA");
	            student.displayDetails();
	        } catch (AgeNotWithinRangeException e) {
	            System.out.println(e.getMessage());
	        } catch (NameNotValidException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	

}
