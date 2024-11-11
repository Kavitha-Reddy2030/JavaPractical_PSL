package com.psl.training.hashmap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(553,"Kavitha");
		map.put(554,"Pranathi");
		map.put(555,"Janani");
		map.put(552, "Hima");
		map.put(556,"Greeshma");
		map.put(557,"Vani");
		System.out.println(map);//maintains insertion order based on keys
		//map.put(null,"Meher");//runtime exception no compilation error but prints remaining key values in sorted fashion
		//System.out.println(map);
		
		
		for(Map.Entry<Integer,String> i:map.entrySet()) {//both key and value pair
				System.out.println(i.getKey()+" "+i.getValue());
			}
	}

}
