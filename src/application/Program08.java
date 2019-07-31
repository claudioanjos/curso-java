package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product1;

public class Program08 {
	// Aula 56 Construtor
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		//System.out.print("Quantity in stock: "); //Retirado na aula 58 de sobrecarga
		//int quantity = sc.nextInt();
		
		//Product1 product = new Product1(name, price, quantity); // Construtor Aula 56
		Product1 product = new Product1(name, price); // Sobrecarga Aula 58
		
		product.setName("Computer"); // Aula 59 Emcapsulamento
		System.out.println("Updated name " + product.getName());
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
	}

}
