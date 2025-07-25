/**
 * 
 */
package week1;

import java.util.Scanner;

/**
 * @author Karthik Bandi Qapitol QA
 *
 */
public class FindLargestOfThreeNumbers {

	/**
	 * @param args
	 */
	public static void LogicToFindLargestNumber(int x, int y, int z) { //Created a method to add logic;
		int temp;
		if(x > y) {
			temp = x;
		}else {
			temp = y;
		}if(z > temp) {
			temp = z;
		}
		System.out.println("Largest of "+x+", "+y+", "+z+" is: "+temp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FindLargestOfThreeNumbers.LogicToFindLargestNumber(4, 3, 3);
		//OR
		Scanner number1 = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int numberone = number1.nextInt();
		
		Scanner number2 = new Scanner(System.in);
		System.out.print("Enter second number: ");
		int numbertwo = number2.nextInt();
		
		Scanner number3 = new Scanner(System.in);
		System.out.print("Enter third number: ");
		int numberthree = number3.nextInt();
		
		FindLargestOfThreeNumbers.LogicToFindLargestNumber(numberone, numbertwo, numberthree);
		
	}

}
