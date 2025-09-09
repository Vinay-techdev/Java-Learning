package chapter_01;
import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		// Taking input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1");
		int a = sc.nextInt();
		System.out.println("Enter Number 2");
		int b = sc.nextInt();
		sc.close();
		
		System.out.println("The sume of 2 number :" + a + b);

	}

}
