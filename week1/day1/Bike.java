// Assignment 4 - Part 2

package week1.day1;

public class Bike {
	
	public void applyBrake() {
		System.out.println("Bike Brake is applied..");
	}

	public static void main(String[] args) {
		//Object 1
		Car c = new Car();
		c.applyBreak();
		c.soundHorn();
		
		//Object 2
		Bike b = new Bike();
		b.applyBrake();
	}

}
