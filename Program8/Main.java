package Program8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Days days = new Days();
		String day;
		System.out.println("Enter the Day : ");
		day = scanner.next();
		days.getResult(day);
		scanner.close();		
	}

}
