package chapter_10;

public class Throw_Vs_Throws {
	
   public static void main(String[] args) {
	   
	   
    try {
		int result = divide(10, 0);
		System.out.println(result);
		
	} catch (Exception e) {
		System.out.println(e.toString());
		
	} finally {
		System.out.println("Program Ends...");
	}
	
  }
   public static int divide(int a, int b) throws ArithmeticExceptions {
	   
	   if(a<=0 || b<=0 ) {
		   throw new ArithmeticExceptions();
	   }
	   int c = a / b;
	   return c;
   }
}

class ArithmeticExceptions extends Exception{
	
	@Override
	public String toString() {
		return "Number cannot be divisble by zero";
	}
	
}
	

