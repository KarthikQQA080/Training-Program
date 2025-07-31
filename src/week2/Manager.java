package week2;

public class Manager extends Employee {

	String department = "Project Delivery";

	public static void main(String[] args) {

		Manager emp1 = new Manager();
		System.out.println("Employee details: " + emp1.name + ", age: " + emp1.age + ", EmployeeID: " + emp1.empId
				+ ", Salary: " + emp1.salary + " and deparment: " + emp1.department + ".");
	}

}
