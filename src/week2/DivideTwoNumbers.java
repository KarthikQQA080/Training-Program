package week2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideTwoNumbers {
	/*
	 * Divide Two Numbers Input two numbers using Scanner Perform division, and
	 * handle: ArithmeticException (division by zero) InputMismatchException
	 */

	void divisionMethod(int a, int b) {
		try {
			int result = a / b;
			System.out.println("Division of " + a + " / " + b + " is " + result);
		} catch (ArithmeticException e) {
			System.err.println("Cannot be divided by zero. Error: " + e);
		}
	}

	public static void main(String[] args) {

		try (Scanner inputA = new Scanner(System.in)) {
			int a = inputA.nextInt();
			int b = inputA.nextInt();
			DivideTwoNumbers obj = new DivideTwoNumbers();
			obj.divisionMethod(a, b);
		} catch (InputMismatchException e) {
			System.err.println("Input is incorrect. Error: " + e);
		}

	}

}
