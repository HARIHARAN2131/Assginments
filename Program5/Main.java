package Program5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Odd_even odd_even = new Odd_even();
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		odd_even.getResult(number);
		scanner.close();
	}

}
