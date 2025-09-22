package chapter_10;

public class Errors {

	public static void main(String[] args) {
		
		//? 1. Syntax error - mistake made by programmers 
		
		/* int a = 10    error - semi-colon missing
		System.out.println(a); */
		
		
		//? 2. Runtime error - mistake made by users
		int a = 3;
		int b = 0;
		System.out.println(a/b); // ArithmeticException: / by zero
		
		// Runtime error can handled using try catch
	}
	
}
