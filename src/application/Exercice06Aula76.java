package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeSecFive;

public class Exercice06Aula76 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// Criando a Lista
		List<EmployeeSecFive> list = new ArrayList<>();
		
		// Parte 1: Lendo os dados
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			System.out.println();
			System.out.println("Employee #" + i + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new EmployeeSecFive(id, name, salary));
		}
		
		// Parte 2: Update Salary de um dado Employee
		
		System.out.println();
		System.out.print("Enter the employee Id that will have salary increase: ");
		int id = sc.nextInt();
		
		EmployeeSecFive emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
		 System.out.print("Enter the percentage: ");
		 double percentage = sc.nextDouble();
		 emp.increaseSalary(percentage);
		}
		
		// Parte 3: LISTING EMPLOYEES
		System.out.println();
		System.out.println("List of employees: ");
		
		for(EmployeeSecFive obj : list) {
			System.out.println(obj);
		}		
		
		sc.close();

	}

}
