package chapter_07;

public class InheritanceInterface {

	public static void main(String[] args) {
		
		greet gt = new greet();
		gt.morning();
		gt.afterNoon();
		gt.evening();
		gt.night();

	}

}
 
interface greet1{
	void morning();
	void afterNoon();
}

/* you cannot able to inherit interface in class but
class greet2 extends greet1{
	void evening();
	void night();
} */

// you can inherit interface with interface like class
interface greet2 extends greet1{
	void evening();
	void night();
}

class greet implements greet2{
	
	public void morning() {
		System.out.println("Good Morning!");
	}
	
	public void afterNoon() {
		System.out.println("Good afterNoon!");
	}
	
	public void evening() {
		System.out.println("Good Evening!");
	}
	
	public void night() {
		System.out.println("Good Night!");
	}
}
