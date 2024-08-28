/*
 * 24. Create a class named 'Member' having the following members:
		1. Data members
		2. Name
		3. Age
		4. Phone number
		5. Address
		6. Salary
		It also has a method named 'printSalary' which prints the salary of
		the members
 */
package Assign;
public class Q24 {  
 
    private String name;  
    private int age;  
    private String phoneNumber;  
    private String address;  
    private double salary;  

    // Constructor  
    public Q24(String name, int age, String phoneNumber, String address, double salary) {  
        this.name = name;  
        this.age = age;  
        this.phoneNumber = phoneNumber;  
        this.address = address;  
        this.salary = salary;  
    }  

   
    public void printSalary() {  
        System.out.println("Salary of " + name + " is: " + salary);  
    }  

    // Getters  
    public String getName() {  
        return name;  
    }  

    public int getAge() {  
        return age;  
    }  

    public String getPhoneNumber() {  
        return phoneNumber;  
    }  

    public String getAddress() {  
        return address;  
    }  

    public double getSalary() {  
        return salary;  
    }  

    
    public static void main(String[] args) {  
        Q24 member1 = new Q24("Parag Makwana", 22, "6352369733", "205 Rander Surat", 35000);  
        member1.printSalary();
    }  
}