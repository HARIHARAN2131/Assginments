package Progarm4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Lower_upper l_u_case = new Lower_upper();
		char letter;
		System.out.println("Enter the Letter : ");
		letter = scanner.next().charAt(0);
		l_u_case.getResult(letter);
		scanner.close();
	}

}
