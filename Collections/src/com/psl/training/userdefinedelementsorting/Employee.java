package com.psl.training.userdefinedelementsorting;

public class Employee  implements Comparable<Employee>  {
	private int id;
	private String name;
	private float salary;
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee e1) {
		
		if(this.id==e1.getId()) {
			return 0;
		}
		else if(this.id<e1.getId()) {
			return -1;
		}
		else
			return 1;
	}
	
	
	
}
