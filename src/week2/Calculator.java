package week2;

public class Calculator {

	/*
	 * Question: Calculator Program Create a class Calculator with overloaded add()
	 * methods: add(int a, int b), add(double a, double b), add(int a, int b, int c).
	 */

	void add(int a, int b) {
		int result = a + b;
		System.out.println("Addition of " + a + " + " + b + " = " + result);
	}

	void add(double a, double b) {
		double result = a + b;
		System.out.println("Addition of " + a + " + " + b + " = " + result);
	}

	void add(int a, int b, int c) {
		int result = a + b + c;
		System.out.println("Addition of " + a + " + " + b + " + " + c + " = " + result);
	}

	public static void main(String[] args) {
		// creating calculator object
		Calculator obj = new Calculator();

		// using first add(int a, int b) method
		obj.add(54, 23);

		// using second add(double a, double b) method
		obj.add(99.56, 123.32);

		// using third add(int a, int b, int c) method
		obj.add(12, 11, 45);
	}

}
