package com.psl.training;

class Car{
	public String fuel="Diesel";
	public void setFuel(String fuel) {
		fuel=fuel;   //It consider only instance variable  i.e; Diesel
		System.out.println(fuel);//But if we print in constructor it considers formal parameter but if the same line written in another it consider instance variable value
		this.fuel=fuel;   //It consider only formal parameter  i.e; Petrol
	}
}

public class This {
	

	public static void main(String[] args) {
		Car car=new Car();
		car.setFuel("Petrol");
		System.out.println(car.fuel);
	}

}
