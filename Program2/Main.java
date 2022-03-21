package Program2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Quadratic_equations program2 = new Quadratic_equations();
		Scanner scanner = new Scanner(System.in);
		double a ,b , c;
		System.out.println("Enter the Number : ");
        a = scanner.nextDouble();
        System.out.println("Enter the Number : ");
        b = scanner.nextDouble();
        System.out.println("Enter the Number : ");
        c = scanner.nextDouble();
        program2.getResult(a, b, c);
        scanner.close();
	}

}
