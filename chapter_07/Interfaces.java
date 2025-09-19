package chapter_07;

public class Interfaces {

	public static void main(String[] args) {
		
		Atals cycle = new Atals();
		cycle.speedUp();
		cycle.applyBrake();
		cycle.stopped();
		
		System.out.println();
		
		//cycle.prize = 4500;  Error: you cannot able change the value as it final
		System.out.println("The prize of cycle: "+cycle.prize); // it also works but gives warning it should be called static way
		System.out.println("The prize of cycle: "+Bicycle.prize); // Static way calling

	}

}

interface Bicycle{
	int prize = 4000;
	void applyBrake();
	void speedUp();
	
	//void stopped(); gives a error if we do not implements in implemented class - so we use default method shown below:
	
	// default method - we can define it
	default void stopped() {
		System.out.println("Cycle stopped");
	}
	
	// classes(applyBrake, speedUp) must be declared as public during implementing interface
}


class Atals implements Bicycle{
	
	public void applyBrake() {
		System.out.println("Brake applied");
	}
	
	public void speedUp() {
		System.out.println("Cycle is in motion");
	}
}