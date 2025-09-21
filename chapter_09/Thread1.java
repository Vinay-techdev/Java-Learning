package chapter_09;

public class Thread1 {

	public static void main(String[] args) {
		
		//1. Thread by extending Thread class
		MyThread1 et1 = new MyThread1();
		MyThread2 et2 = new MyThread2();
		
		et1.setPriority(Thread.MAX_PRIORITY); // gives more priority to this thread
		et1.start();
		et2.start();

	}

}

//? Two way to create thread 

//1. Thread by extending Thread class
class MyThread1 extends Thread{
	
	@Override
	public void run(){
		
		// Scroll output it gives time for both thread 1 & 2 to run
		int i = 0;
		while(i<=500) {
			System.out.println("Thread1 is running");
			i++;
		}
	}
}

class MyThread2 extends Thread{
	@Override
	public void run(){
		int i = 0;
		while(i<=500){
			System.out.println("Thread2 is running");	
			i++;
		}
	}
}

