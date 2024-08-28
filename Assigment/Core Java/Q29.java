/*
 * 29. Create an abstract class 'Bank' with an abstract method 'getBalance'.
 *       $100, $150 and $200 are deposited in banks A, B and C respectively.
 *        'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank',
 *         each having a method named 'getBalance'. Call this method by
 *          creating an object of each of the three classes.
 */
package Assign;
abstract class Bank {
    protected double balance;

    
    public abstract double getBalance();
}

class BankA extends Bank {
    public BankA() {
        balance = 100;
    }

   
    public double getBalance() {
        return balance;
    }
}


class BankB extends Bank {
    public BankB() {
        balance = 150;
    }

   
    public double getBalance() {
        return balance;
    }
}


class BankC extends Bank {
    public BankC() {
        balance = 200;
    }

   
    public double getBalance() {
        return balance;
    }
}
public class Q29 {
	    public static void main(String[] args) {
	        
	        BankA bankA = new BankA();
	        
	        System.out.println("Balance in Bank A: $" + bankA.getBalance());

	       
	        BankB bankB = new BankB();
	       
	        System.out.println("Balance in Bank B: $" + bankB.getBalance());

	        
	        BankC bankC = new BankC();
	        
	        System.out.println("Balance in Bank C: $" + bankC.getBalance());
	    }
	

}
