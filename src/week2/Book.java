package week2;

public class Book {

	/*
	 * Question: Override toString() Create a Book class with title, author, price
	 * Override toString() to print like:
	 */

	String title = "Java programming";
	String author = "JP";
	Double price = 999.5;

	@Override
	public String toString() {
		return title + " by " + author + " just " + price + " only.";
	}

	public static void main(String[] args) {
		// creating Book object
		Book obj = new Book();
		System.out.println(obj); // Printing the book object(return string of toString())
	}

}
