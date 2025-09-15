package chapter_04;

public class VarArgs {
	
	//Variable arguments
	static int sum(int ...arr) { // Here arr means int[] arr = {}
		int result = 0;
		for(int num : arr) {
			result += num;
		}
		return result;
	}
		
	/* at least one args must passed in method call
	static int sum(int a, int ...arr) {
		int result = a;
		for(int num : arr) {
			result += num;
		}
		return result;
	} */

	public static void main(String[] args) {
		System.out.print("Sum of numbers: "+sum(10, 20, 30, 10, 50, 33));
		//System.out.print("Sum of numbers: "+sum());
	}

}
