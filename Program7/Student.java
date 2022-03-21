package Program7;

public class Student {
	void getResult(int m1,int m2,int m3,int m4,int m5) {
		int total;
		float avg;
		total = m1+m2+m3+m4+m5;
		System.out.println("Total : "+total);
		avg = total/5;
		System.out.println("Average : "+avg);
		if((avg>=90.0)&&(avg<=100))
			System.out.println("Excellent");
		else if((avg>=80.0)&&(avg<90))
			System.out.println("Good");
		else if((avg>=60.0)&&(avg<80))
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}

}
