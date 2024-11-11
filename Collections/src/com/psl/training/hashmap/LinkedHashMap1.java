package com.psl.training.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
		map.put(553,"Kavitha");
		map.put(554,"Pranathi");
		map.put(555,"Janani");
		map.put(552, "Hima");
		map.put(556,"Greeshma");
		map.put(557,"Vani");
		System.out.println(map);//maintains sequential order of elements.It follows hash table
		
		 map.remove(556);//deletion based on key 
		 System.out.println(map);
		 
		 map.remove(554, "Pranathi"); 
		 map.remove(559, "Pranathi");
		 System.out.println(map);//deletion based on both key and value
		 
		 map.put(554, "Pranathi"); 
		 map.put(559, "Pranathi");//prints both key value pairs if duplicate values are present
		 System.out.println(map);
		 
		 map.put(555,"Junnu");
		 System.out.println(map);//iT replaces the string if we have duplicate key
		 
		 map.put(null,"Janu");
		 map.put(null,"Johny");//allows null key and values also
		 map.put(null,"null");//but prints the latest added key value pair if we have dupliccates keys
		 System.out.println(map);
		
		 //Traversing using enhanced for loop 
		 for(Integer i:map.keySet()) {//only keys
			 System.out.println(i);
		 }
		 
		 for(Map.Entry<Integer,String> i:map.entrySet()) {//both key and value pair
				System.out.println(i.getKey()+" "+i.getValue());
			}
	}

}
