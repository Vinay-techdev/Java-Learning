package chapter_02;
import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		sc.close();
		
		// Math Table using For loop
		for(int i =1; i<=10; i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
		
		System.out.println("");
		
		int j = 1;
		
		// While loop
		while(j<=10) {
			System.out.println(j);
			j++;
		}
		
		System.out.println();
		
		// Do while
		do {
			System.out.println("Hi"); // prints at least once even if condition is false
		}while(j>20); // condition false

	}

}
