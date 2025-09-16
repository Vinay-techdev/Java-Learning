package chapter_05;

public class Constructors {

	public static void main(String[] args) {
		
		// 0 args constructor calls
		MyEmployees emp = new MyEmployees();
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		
		System.out.println();
		
		MyEmployees emp1 = new MyEmployees(1, "Vinay");
		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
	}
}

class MyEmployees{
	private int id;
	private String name;
	
	//Constructor
	public MyEmployees(int id, String name) {
		this.id = id;  // this.id point to outer id private variable(covers next chapter)
		this.name = name;
	}
	
	// Constructor overloading
	public MyEmployees() {
		 id = 00;
		name = "Your_Name";
	}

	
	/* Setters
	public void setId(int i) {
		id = i;
	}
	
	public void setName(String n) {
		name = n;
	} */
	
	//Getters
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

}
