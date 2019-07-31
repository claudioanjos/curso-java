package course;

import java.util.Scanner;

public class ExerciceAula24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (a > b && a > c) {
			
			System.out.println("Higher = " + a);			
		}
		
		else if (b > c) {
			System.out.println("Higher = " + b);
		}
		
		else {
			System.out.println("Higher = " + c);
		}
		
		sc.close();

	}

}
