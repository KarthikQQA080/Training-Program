package week2;

public class StudentsDetailsProgram {
	// name, age and rollNo variables
	String name;
	int age;
	int rollNo;

	public StudentsDetailsProgram(String name, int age, int rollNo) {
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
	}

	void displayDetails() { // method to display student details
		System.out.println("Student name is: " + name + ", age: " + age + " and Roll number: " + rollNo);
	}

	public static void main(String[] args) {

		StudentsDetailsProgram student1 = new StudentsDetailsProgram("Raju", 10, 21); // student 1 object
		StudentsDetailsProgram student2 = new StudentsDetailsProgram("Ravi", 11, 22); // student 2 object
		StudentsDetailsProgram student3 = new StudentsDetailsProgram("Rani", 10, 23); // student 3 object

		student1.displayDetails();
		student2.displayDetails();
		student3.displayDetails();

	}

}
