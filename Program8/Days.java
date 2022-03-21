package Program8;

public class Days {
	void getResult(String day) {
		switch(day) {
		case "Monday":
		case "MONDAY":
			System.out.println("First day of the Week");
		case "Tuesday":
		case "TUESDAY":
			System.out.println("Second day of the Week");
		case "Wednesday":
		case "WEDNESDAY":
			System.out.println("Mid day of the Week");
		case "Thursday":
		case "THURSDAY":
			System.out.println("Mid day of the Week");
		case "Friday":
		case "FRIDAY":
			System.out.println("Last working day");
		case "Saturday":
		case "SATURDAY":
			System.out.println("Week end");
		case "Sunday":
		case "SUNDAY":
			System.out.println("Week end");
		}
	}

}
