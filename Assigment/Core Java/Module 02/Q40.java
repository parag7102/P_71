/*
 * 40. W.A.J.P to create a custom exception if Customer withdraw amount 
 *       which is greater than account balance then program will show 
 *       custom exception otherwise amount will deduct from account balance. 
 *       Account balance is: 2000 Enter withdraw amount: 2500
          Sorry, insufficient balance, you need more 500 Rs. To perform 
          this transaction.
 */
package Assign;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);
	}
}

public class Q40 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double accountBalance = 2000;

		System.out.println("Account balance is: " + accountBalance);
		System.out.print("Enter withdraw amount: ");
		double withdrawAmount = scanner.nextDouble();
		scanner.close();

		try {
			withdraw(accountBalance, withdrawAmount);
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void withdraw(double accountBalance, double withdrawAmount) throws InsufficientBalanceException {
		if (withdrawAmount > accountBalance) {
			double shortBalance = withdrawAmount - accountBalance;
			throw new InsufficientBalanceException(
					"Sorry, insufficient balance, you need more " + shortBalance + " Rs. To perform this transaction.");
		} else {
			accountBalance -= withdrawAmount;
			System.out.println("Amount deducted successfully. New balance is: " + accountBalance);
		}
	}
}
