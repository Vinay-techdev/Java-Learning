package chapter_05;

public class Oops {
	// Main Method
	public static void main(String[] args) {
		
		employees details = new employees(); // object creation
		
		// Assigning value to attributes
		details.name = "Vinay";
		details.age = 21;
		details.salary = "4LPA";
		
		details.display();
	}

}

//Class creation

//public class display - error: only one public class is allowed or must be defined in its own file
class employees{
	
	// attributes
	String name;
	int age;
	String salary;
	
	//Methods
	public void display() {
		System.out.println("The employee is working in xyz company");
		System.out.println("The name of employee: "+name);
		System.out.println("The age of employee: "+age);
		System.out.println("The salary of employee: "+salary);
	}
}
	
