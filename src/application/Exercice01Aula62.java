package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Exercice01Aula62 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
						
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");		 
		String holder = sc.next();
		
		char response;
		sc.nextLine();
		
		do {
		
		System.out.print("Is there an initial deposit (y/n)? ");
		response = sc.next().charAt(0);
		} while(response != 'y' && response != 'n');
		
		if(response == 'y' ) {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(holder, number, initialDeposit);
		}
		else {			
			account = new Account(holder, number);
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);		

		sc.close();
	}

}
