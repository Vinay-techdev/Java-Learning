package chapter_09;

public class Thread2 {

	public static void main(String[] args) {


		// 2.Thread by implementing runnable interface
		MyThreadRunnable1 rt1 = new MyThreadRunnable1();
		Thread t1 = new Thread(rt1);
				
		MyThreadRunnable2 rt2 = new MyThreadRunnable2();
		Thread t2 = new Thread(rt2);
				
		t1.start();
		t2.start();

	}

}


//2.Thread by implementing runnable interface

class MyThreadRunnable1 implements Runnable{
	
	public void run() {
		System.out.println("I am runnable Thread 1");
		System.out.println("I am runnable Thread 1");
		System.out.println("I am runnable Thread 1");
		System.out.println("I am runnable Thread 1");
		System.out.println("I am runnable Thread 1");
		System.out.println("I am runnable Thread 1");
	}
}

class MyThreadRunnable2 implements Runnable{
	
	public void run() {
		System.out.println("I am runnable Thread 2");
		System.out.println("I am runnable Thread 2");
		System.out.println("I am runnable Thread 2");
		System.out.println("I am runnable Thread 2");
		System.out.println("I am runnable Thread 2");
		System.out.println("I am runnable Thread 2");
	}
}