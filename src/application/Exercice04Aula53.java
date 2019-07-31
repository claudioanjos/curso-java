package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Exercice04Aula53 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double bought = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = R$ %.2f%n", CurrencyConverter.dollarToReal(price, bought));
		
		sc.close();

	}

}
