/**
 * 
 */
package week1;

/**
 * @author Qapitol QA
 *
 */
public class CountVowelsInString {

	/**
	 * @param args
	 */
	//AEIOU
	public static void countVowels(String word) {
		int count=0;
		for (int i=0;i<word.length();i++) {
			char c = word.toUpperCase().charAt(i);
			if (c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				System.out.println(c);
				count = count+1;
			}
		}
		System.out.println("Number of vowels in given string("+word+"): "+count);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word= "Training Program";
		countVowels(word);
	}
}
