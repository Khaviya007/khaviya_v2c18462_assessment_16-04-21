package com.test;
public class String6 {
	public static void main(String[] args) {
		String str1 ="XYZ";
		String str2 ="YXZ";  
        
        if(str1.length()!=str2.length()){  
            System.out.println("2nd string is not a rotation of 1st string");  
        }  
        else {  
        	str1=str1.concat(str1);  
            if(str1.indexOf(str2)!=-1)  
                System.out.println("2nd string is a rotation of 1st string");  
            else  
                System.out.println("2nd string is not a rotation of 1st string");  
	}
	}
}  

	


