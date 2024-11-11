package com.psl.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class delete {

	public static void main(String[] args) {
		try{  
			//1.load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");  
			
			//2.Establish the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","root","root");  
			
			//3.create statement
			PreparedStatement stmt=con.prepareStatement("delete from customerInfo where id=555 " );  
			
			//4.Execute
			stmt.execute();
			System.out.println("Deleted data Successfully");
			
			//Close connection
			con.close();  
			}catch(Exception e){ System.out.println(e);}  

	}

}
