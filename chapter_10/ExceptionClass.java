package chapter_10;

public class ExceptionClass {

	public static void main(String[] args) {
		
		int a = 8;
		
		if (a<99) {
			
			try {
				throw new MyException();
				
			} catch (Exception e) {
				System.out.println(e.getMessage());			
				System.out.println(e.toString());			
				System.out.println(e);			
			}
		}

	}

}

// custom exception
class MyException extends Exception{
	
	@Override
	public String toString() {
		return "I am String";
	}
	
	@Override
	public String getMessage() {
		return "I am Message";
	}
	
}
