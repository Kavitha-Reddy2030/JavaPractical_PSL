package com.psl.training.hashtable;
import java.util.Hashtable;
import java.util.Map;
class Student {
	private int rollNo;

	public Student(int rollNo) {
		super();
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + "]";
	}
	

}

public class HashTable1 {

	public static void main(String[] args) {
		Hashtable<Integer,String> table=new Hashtable<Integer,String>();//must have 2 args as key value pair
		table.put(553,"Kavitha");
		table.put(554,"Pranathi");
		table.put(552,"Hima");
		table.put(555,"Janani");
		table.put(543,"Suchitha");
		System.out.println(table);//no sequential order randomly prints based on hash value
		
		for(Map.Entry<Integer,String> i:table .entrySet()) {//both key and value pair
			System.out.println(i.getKey()+" "+i.getValue());
		}
		
		 
		 Hashtable<Student,String> table1=new Hashtable<Student,String>();
		 table1.put(new Student(553),"Kavitha");
		 table1.put(new Student(554),"Pranathi");
		 table1.put(new Student(555),"Janani");
		 System.out.println(table1);
		 
		 System.out.println();
		 System.out.println("Accessing through for each loop");
		 for(Map.Entry<Student,String> i:table1.entrySet()) {//both key and value pair
				System.out.println(i.getKey()+" "+i.getValue());
			}
		 
	}

}
