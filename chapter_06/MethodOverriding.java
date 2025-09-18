package chapter_06;

public class MethodOverriding {

	public static void main(String[] args) {
		
		animals a = new animals();
		a.animal();
		
	    System.out.println();
		
		cat c = new cat();
		c.animal();
		c.speak();

	}

}

class animals {
	
	public void animal() {
		System.out.println("This Animal sounds like: ");
	}
}

class cat extends animals{
	
	// Overriding method animal from class animals
	
	@Override
	public void animal() {
		System.out.println("Cat sounds like: ");
	}
	
	public void speak() {
		System.out.println("Mewo Mewo");
	}
}

