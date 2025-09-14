package chapter_03;

public class methods {

	public static void main(String[] args) {
		
		// Method call of sum static method
		int res1 = sum(10, 20);
		System.out.println("Sum of two numbers : " +res1);
		
		// int res2 = sub(10, 20); // error : Cannot call non-static method inside static method(main)
		
		// Method call of sub non-static method using object creation
		methods obj = new methods();
		int res2 = obj.sub(20, 10);
		
		System.out.println("Sub of two numbers: "+res2);
	}
	
	// Method definition
	static int sum(int x, int y) {
		return x+y;	
	}
	
	int sub(int x, int y) {
		return x-y;	
	}

}
