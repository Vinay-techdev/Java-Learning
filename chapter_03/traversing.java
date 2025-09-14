package chapter_03;

public class traversing {

	public static void main(String[] args) {
		
		int[] marks = {87, 81, 85, 92};
		System.out.println("The length of array : "+marks.length);
		
		System.out.println("Normal traversing");
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		
		
		System.out.println("Traversing using for loop");
		for(int i=0; i<marks.length; i++) {
			System.out.println(marks[i]);
		}
		
		System.out.println("Traversing using for loop in reverse order");
		for(int i=marks.length - 1; i>=0; i--) {
			System.out.println(marks[i]);
		}
		
		System.out.println("Traversing using for each loop");
		for(int i : marks) {
			System.out.println(i);
		}
	}
}
