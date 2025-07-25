/**
 * 
 */
package week1;

/**
 * @author Karthik Bandi Qapitol QA
 *
 */
public class PrintEvenNumberFromAnArray {

	/**
	 * @param args
	 */
	public static void printEvenNumbersfromTheArray(int[] Numbers) {
		for(int i=0; i<Numbers.length; i++) {
			if(Numbers[i]%2==0) {
				System.out.print(Numbers[i]+", ");;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Array= {1,2,3,4,5,6,7,8,0,1};// We can also use Scanner class and for loop to give numbers at run time;
		PrintEvenNumberFromAnArray.printEvenNumbersfromTheArray(Array);
	}

}
