package Progarm3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Leap_year leapyear = new Leap_year();
		System.out.println("Enter a Year : ");
		int year = scanner.nextInt();
		leapyear.getResult(year);
		scanner.close();
	}

}
