package Program7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		int mark1,mark2,mark3,mark4,mark5;
		System.out.println("Enter the 5 Subject marks :");
		System.out.println("Mark 1 :");
		mark1 = scanner.nextInt();
		System.out.println("Mark 2 :");
		mark2 = scanner.nextInt();
		System.out.println("Mark 3 :");
		mark3 = scanner.nextInt();
		System.out.println("Mark 4 :");
		mark4 = scanner.nextInt();
		System.out.println("Mark 5 :");
		mark5 = scanner.nextInt();
		student.getResult(mark1, mark2, mark3, mark4, mark5);
		scanner.close();
	}

}
