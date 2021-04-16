package com.test;
import java.util.HashMap;
import java.util.Map;
public class Hashmap1 {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();    
		   map.put(1,"Tom");    
		   map.put(3,"Ram");    
		   map.put(2,"Sam");   
		   map.put(4,"Jhon");   
		       
		   System.out.println("The elements are: ");  
		   for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
	}
}
