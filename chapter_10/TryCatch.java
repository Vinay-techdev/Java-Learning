package chapter_10;

public class TryCatch {

	public static void main(String[] args) {
		
		int a = 88888;
		int b = 0;
		
		try {
			int c = a/b;
			System.out.println("The Result is "+c);
			
		} catch (Exception e) {
			System.out.println("Failed to divide, Reason: ");
			System.out.println(e);
		}
		
		System.out.println("End of program....");
		
		/* ArrayIndexOutOfBoundsException
		int [] marks = {85, 80, 76, 89};
		System.out.println(marks[4]);
		*/
	}

}
