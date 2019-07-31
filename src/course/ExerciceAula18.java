package course;

import java.util.Locale;
import java.util.Scanner;

public class ExerciceAula18 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name:");
		String name = sc.nextLine(); // Alex Green
		
		System.out.println("How many bedroons are in your house?");
		int n1 = sc.nextInt(); // 3
		
		System.out.println("Enter product price:");
		double price = sc.nextDouble(); // 500.50
		
		System.out.println("Enter your last name, age and height (same line)"); // Green 21 1.73
		String name2 = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		System.out.println(name);
		System.out.println(n1);
		System.out.println(price);
		System.out.println(name2);
		System.out.println(age);
		System.out.println(height);		
		
		sc.close();
	}

}
