package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator01;

public class Program07 {
	// VERSÃO 03	AULA 52
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator01.circunference(radius);
		
		double v = Calculator01.volume(radius);
		
		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator01.PI);
				
		sc.close();
	}

}
