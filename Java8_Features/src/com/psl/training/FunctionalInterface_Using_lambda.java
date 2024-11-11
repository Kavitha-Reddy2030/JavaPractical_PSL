package com.psl.training;

@FunctionalInterface
interface Vehicle{
	void getSpeed(int speed);
}

public class FunctionalInterface_Using_lambda {

	public static void main(String[] args) {
		
		//1.Using lambda expression
		
		/*
		 * Vehicle vehicle=()->{ System.out.println("Speed:80km/hr"); };  vehicle.getSpeed();  //for no arg abstract method
		 */
		
		Vehicle vehicle=(x)->{ System.out.println("Speed: "+x+"km/hr"); };
		vehicle.getSpeed(80);
	}

}
