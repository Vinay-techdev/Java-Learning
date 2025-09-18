package chapter_06;

public class DyanamicMethodDispatch {
	
	public static void main(String[] args) {
		
		Phone obj = new SmartPhone(); // Dynamic method dispatch
		obj.pick(); // prints iphone method
		
		obj.nokia(); // it prints
		// obj.iphone(); it does not work
		
	}
	
}


class Phone {
	
	public void nokia() {
		System.out.println("Truning on nokia");
	}
	
	public void pick() {
		System.out.println("Picking Phone");
	}
}

class SmartPhone extends Phone{
	
	public void iphone() {
		System.out.println("Truning on iphone");
	}
	
	@Override
	public void pick() {
		String name = "iphone";
		System.out.println("Picking "+name);
	}
}
