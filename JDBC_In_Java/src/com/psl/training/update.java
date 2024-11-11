package com.psl.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class update {

	public static void main(String[] args) {
		try{  
			//1.load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");  
			
			//2.Establish the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","root","root");  
			
			//3.create statement
			PreparedStatement stmt=con.prepareStatement("update customerInfo set id=? where name='Kavitha'" );  
			stmt.setInt(1,0553);
			
			//4.Execute
			stmt.execute();
			System.out.println("Updated data Successfully");
			
			//Close connection
			con.close();  
			}catch(Exception e){ System.out.println(e);}  

	}

}
