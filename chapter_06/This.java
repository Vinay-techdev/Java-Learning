package chapter_06;

public class This {

	public static void main(String[] args) {
		
		Students stud = new Students();
		System.out.println(stud.id);
		System.out.println(stud.name);

		System.out.println();
		
		Students stud1 = new Students(1, "Vinay");
		System.out.println(stud1.id);
		System.out.println(stud1.name);
	}

}

class Students{
	int id;
	String name;
	
	public Students(){
		id = 00;
		name = "Your_Name";
	}

	public Students(int id, String name){
		this.id = id;
		this.name = name;
	}
}
