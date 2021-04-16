package com.test;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
public class RemoveDuplicate {  		 	
		public static void main(String[] args) {  
		LinkedList<Integer> cl = new LinkedList<Integer>();  		
		cl.add(9);  
		cl.add(2);  
		cl.add(5);  
		cl.add(2);  
		cl.add(9);  
		cl.add(4);  
		System.out.println("linked list:"+cl);
		Set<Integer> s = new LinkedHashSet<Integer>(cl);  
        System.out.println(s);  
		}  
		}  

