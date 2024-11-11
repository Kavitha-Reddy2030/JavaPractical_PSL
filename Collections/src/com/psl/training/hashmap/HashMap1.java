package com.psl.training.hashmap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(553,"Kavitha");
		map.put(554,"Pranathi");
		map.put(555,"Janani");
		map.put(552, "Hima");
		map.put(556,"Greeshma");
		map.put(557,"Vani");
		System.out.println(map);//no sequential order of elements.It follows hash table
		
		map.remove(556);//deletion based on key
		System.out.println(map);
		map.remove(554, "Pranathi");
		System.out.println(map);//deletion based on both key and value
		map.put(555,"Junnu");
		System.out.println(map);//It replaces old value with new value
		map.put(554,"Janani");//allows duplicates keys and values
		System.out.println(map);
		map.put(null, null);
		System.out.println(map);
		map.put(null, null);//no compilation error but prints only once
		System.out.println(map);
		
		
		Set set=map.entrySet();	//prints both keys and its values
		System.out.println(set);
		Set set1=map.keySet();	//prints only keys
		System.out.println(set1);
		
		//Traversing the hash map elements using enhanced for loop
		System.out.println();
		System.out.println("Keys"+" "+"Values");
		for(Map.Entry<Integer,String> i:map.entrySet()) {
			System.out.println(i.getKey()+" "+i.getValue());
		}
		
		//Traversing the hash map elements using iterator interface
		System.out.println();
		Set set2=map.entrySet();
		Iterator iter=set2.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
