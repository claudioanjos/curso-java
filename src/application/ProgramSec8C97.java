package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class ProgramSec8C97 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// aula 97 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		// Entrar com os dados
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		
		System.out.println("Enter worker data:");
		
		System.out.print("Name: ");
		String wokerName = sc.nextLine();
		
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		// Instanciar o trabalhador:
		Worker worker = new Worker(wokerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		// Inserir os contratos:
		System.out.print("How many contracts to this worker? ");
		int howMany = sc.nextInt();
		
		for(int i=1; i<=howMany; i++) {
			 System.out.println("Enter contract # " + i + " data:");
			 System.out.print("Date (DD/MM/YYYY): ");
			 Date contractDate = sdf.parse(sc.next());
			 System.out.print("Value per hour: ");
			 double valuePerHour = sc.nextDouble();
			 System.out.print("Duration (hours): ");
			 int hours = sc.nextInt();
			 // Instanciar o Hora por Contrato
			 HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			 // Vincular os dados do contrato ao trabalhador
			 worker.addContract(contract);
		}
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartament().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();

	}

}
