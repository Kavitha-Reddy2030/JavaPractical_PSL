package com.psl.training;
public class Car {
	private String model;
	private long price;
	
	
	
	public Car(String model, long price) {
		super();
		this.model = model;
		this.price = price;
	}

	

	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public long getPrice() {
		return price;
	}



	public void setPrice(long price) {
		this.price = price;
	}

	

	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + "]";
	}



	public static void main(String[] args) {
		
		Car car1 = new Car("suzuku",20_000L);
		Car car2 = new Car("Bullet",1_00_000L);
		System.out.println(car1);
		System.out.println(car2);
		car1=null;
		System.gc();	//calling of garbage collector and it call finalize method
	}
	
	@Override
	protected void finalize() {//garbage collector automatically calls finalize method no need to explicitly call it
		System.out.println("All resources has been released");//To close all the connetions
	}
}
