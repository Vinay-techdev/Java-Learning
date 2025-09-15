package chapter_04;

public class method_overloading {
	
	// void return type
	static void joke() {
		System.out.println("why did the two Java methods get a divorce?\nBecause they had constant arguments");
	}
	
	// Method overloading - Having same method name but with different signature
	static void num(int a, int b) {
		System.out.println(a + b);
	}
	
	static void num(String a, String b) {
		System.out.println(a + " " + b);
	}
		
	// main method
	public static void main(String[] args) {
		joke();
		num(10, 20);
		num("Vinay", "P");
	}
}
