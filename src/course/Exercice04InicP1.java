package course;

import java.util.Locale;
import java.util.Scanner;

public class Exercice04InicP1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int number, hour;
		double valor, salario;
		
		number = sc.nextInt();
		hour = sc.nextInt();
		valor = sc.nextDouble();
		
		salario = hour * valor;
		
		System.out.println("Number = " + number);
		System.out.printf("Salary = U$ %.2f", salario);
		
		sc.close();
	}

}
