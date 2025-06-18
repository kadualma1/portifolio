package application;

import java.util.Scanner;

import entities.Account;
import exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data:");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();
			
			System.out.println();
			System.out.print("Enter the amount to withdraw: ");
			Double amount = sc.nextDouble();
			Account acc = new Account(number, holder, balance, withdrawLimit);
			acc.withdraw(amount);
			System.out.println("New balance: " + acc.getBalance());
		}
		catch (BusinessException err){
			System.out.println(err.getMessage());
		}
		
		sc.close();

	}

}
