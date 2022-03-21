package Progarm4;

public class Lower_upper {
	void getResult(char letter) {
		int a = letter;
		if((a>=65)&&(a<=90)) {
			System.out.println("Letter - "+letter+" is Upper Case ");
		}
		else {
			System.out.println("Letter - "+letter+" is Lower Case ");
		}
	}
}
