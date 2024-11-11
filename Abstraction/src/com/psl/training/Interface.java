package com.psl.training;

interface Area{
	
	int a = 10;
	/*
	* If we don't initialize it throws compilation error becoz all interface
	* variables by default public static final Best practice to put these keywords
	* while declaring
	*/
	public void Circle();
	public void Square();
	public void Circle(int r);
	public void Square(int side);
	
	public static void getInfo() {
		System.out.println("Interface Variable Value:"+a);
	}
}

class AreaImpl implements Area{

	@Override
	public void Circle() {
		int r=10;
		double area=3.14*r*r;
		System.out.println("Circle Area :"+area);		
	}

	@Override
	public void Square() {
		int side=5;
		double area=side*side;
		System.out.println("Square Area :"+area);
	}

	@Override
	public void Circle(int r) {
		double area=3.14*r*r;
		System.out.println("Circle Area :"+area);	
	}
	
	//We can give value during runtime also

	@Override
	public void Square(int side) {
		double area=side*side;
		System.out.println("Square Area :"+area);	
	}
	
}

public class Interface {

	public static void main(String[] args) {
		
		//We cannot create an object to an interface
		Area area1=new AreaImpl();
		area1.Circle();
		Area area2=new AreaImpl();
		area1.Square();
		Area area3=new AreaImpl();
		area1.Circle(4);
		Area area4=new AreaImpl();
		area1.Square(10);

		//we can't create an object for interface so we access its methods by its interface name if it is static or if it is default method just access through its implemented class object
		Area.getInfo();
	}

}
