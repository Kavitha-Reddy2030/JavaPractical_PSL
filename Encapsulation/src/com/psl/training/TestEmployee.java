package com.psl.training;

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee=new Employee(553,"Kavitha");
		System.out.println("Employee ID:"+employee.getId());
		System.out.println("Employee NAME:"+employee.getName());
		
		Employee emp1=new Employee(557,"Greeshma");
		System.out.println("Employee ID:"+emp1.getId());
		System.out.println("Employee NAME:"+emp1.getName());
		System.out.println("Since employee name is incorrect we are resetting the name of emp1 object");
		emp1.setName("Vani");
		System.out.println("Correct Employee NAME:"+emp1.getName());
		
		//We are encapsulating the class with getter setter methods
		//If we want the user to only read our application we can just provide getter access
		//Since user don't know whether we have used setter/getter,he can just access EmpDetails method
		//In that method we have just provided only  read access to the data
		Employee emp2=new Employee(556,"Greeshma");
		emp2.EmpDetails();
	}

}
