package Program6;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Multiple multiple = new Multiple();
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		multiple.getmultiple(number);
		scanner.close();
	}
}
