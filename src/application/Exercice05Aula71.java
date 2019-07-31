package application;

import java.util.Locale;
import java.util.Scanner;

import entities.RoomsSecFive;

public class Exercice05Aula71 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		RoomsSecFive[] vect = new RoomsSecFive[10];
		
		for (int i=1; i<=n; i++) {
			
			System.out.println();
			
			System.out.println("Rent #"+ i +": ");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new RoomsSecFive(name, email);
			
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		
		for (int i=0; i<10; i++) {
			if (vect[i]!=null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		System.out.println("***********");
		
		for (RoomsSecFive obj : vect) {
			//System.out.println(obj);
			
			if (obj!=null) {
				System.out.println(obj + ": " + obj);
			}
		}
		
		sc.close();

	}

}
