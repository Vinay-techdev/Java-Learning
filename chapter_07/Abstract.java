package chapter_07;

public class Abstract {

	public static void main(String[] args) {
		
		child obj = new child();
		obj.greet();
		
		//parent obj1 = new parent(); throw error: we cannot able create object of abstract class
	}

}

// abstract class
abstract class parent{ // class must be declared as abstract, if it has abstract method
	
	public parent() {
		System.out.println("Hey, I am abstract constructor");
	}
	
	// abstract method
	abstract public void greet();
	abstract public void greet2();
}

class child extends parent{
	
	@Override
	public void greet() {
		System.out.println("Good Morning!");
	}
	
	// it is must to override parent all abstract method, if your inheriting parent class or make class as abstract
	@Override
	public void greet2() {
		System.out.println("Good Afternoon!");
	}

}

// Error: child must override abstract greet() method from parent or must be declared as abstract
// if not, do not inherit parent

/*class child extends parent{
	
	public void display() {
		System.out.println("Hey...,");
	}
}*/