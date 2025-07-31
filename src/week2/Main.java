package week2;

public class Main {
	
	static UserLogin obj;

	public static void validateMethod(String EnteredUserName, String EnteredPassword) {
		// Creating obj and validating creds with provided data

		if (EnteredUserName == obj.getUsername() && EnteredPassword == obj.getPassword()) {
			System.out.println("Login successfull !");
		} else {
			System.out.println("Incorrect creds !");
		}
	}

	public static void updatingPassword(String EnteredUserName, String EnteredPassword) {

		if (EnteredUserName == obj.getUsername()) {
			obj.setPassword(EnteredPassword);
		} else {
			System.out.println("Incorred username !");
		}
	}

	public static void main(String[] args) {
		obj = new UserLogin();
		Main.validateMethod("QQA0080", "@$123IO");// Validating creds with existing creds

		Main.updatingPassword("QQA0080", "123456");// updating the password

		Main.validateMethod("QQA0080", "@$123IO"); // Validating with old creds
		
		Main.validateMethod("QQA0080", "123456"); // Again validating with new password

	}

}
