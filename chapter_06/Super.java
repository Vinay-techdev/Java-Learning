package chapter_06;

public class Super {

	public static void main(String[] args) {
		// call zero parameter constructor
		parent obj1 = new parent();
		
		System.out.println();
		
		// Calls parameterized constructor
		parent obj2 = new parent(2);

	}

}

class child{
	
	child(){ // First child constructor called then parent
		System.out.println("I am child constructor");
	}
	
	child(int a){ 
		System.out.println("I am child constructor "+ a);
	}
}

class parent extends child{
	
	parent(){
		System.out.println("I am parent constructor");
	}
	
	parent(int a){
		super(2); // calls parameterized constructor in child
		System.out.println("I am parent constructor " + a);
	}

}

