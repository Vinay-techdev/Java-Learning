package chapter_06;

public class Iheritance {

	public static void main(String[] args) {
		
		b obj = new b();
		obj.display();
		obj.show();
		
		System.out.println();
		
		c o = new c();
		o.display();
		o.show();
		o.print();

	}

}

// single inheritance a -> b
class a{
	
	public void display() {
		System.out.println("I am class A");
	}
}

class b extends a{
	
	public void show() {
		System.out.println("I am class B");
	}
}


// Multi-Level inheritance a -> b -> c
class c extends b{
	public void print() {
		System.out.println("I am class c");
	}

}

