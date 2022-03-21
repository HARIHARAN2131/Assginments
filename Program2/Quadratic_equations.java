package Program2;

public class Quadratic_equations {
	double root1, root2;

	void getResult(double a, double b, double c) {
		double determinant = ((b * b) - (4 * (a * c)));
		if (determinant > 0) {
			root1 = (-b + Math.sqrt(determinant)) / (2 * a);
			root2 = (-b - Math.sqrt(determinant)) / (2 * a);
			System.out.format("root1 = %.8f and root2 = %.8f", root1, root2);
		} else if (determinant == 0) {
			root1 = root2 = -b / (2 * a);
			System.out.format("root1 = root2 = %.8f;", root1);
		} else {
			double real = -b / (2 * a);
			double imaginary = Math.sqrt(-determinant) / (2 * a);
			System.out.format("root1 = %.8f+%.8fi", real, imaginary);
			System.out.format("\nroot2 = %.8f-%.8fi", real, imaginary);
		}
	}
}
