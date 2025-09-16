package chapter_05;

public class AccessModifier {

	public static void main(String[] args) {
		
		employeess emp = new employeess();
		
		/* Error: cannot access private attributes 
		emp.id = 1;
		emp.name = "Vinay"*/
		
		emp.setId(1);
		emp.setName("vinay");
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
	}

}

class employeess{
	private int id;
	private String name;
	
	// Setters
	public void setId(int i) {
		id = i;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	//Getters
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

}