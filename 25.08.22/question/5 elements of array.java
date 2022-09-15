package com.java1
public class arrayornot

 public static void main(string[]arrgs) {
		int[] num = {0,1,2,3,4}; 
	        int element = 2;
	        int index = -1;
	         
	        for(int i = 0; i < num.length; i++) {
	            if(num[i] == element) {
	                index = i;
	                break;
	            }
	        }
	         
	        System.out.println("Index of "+element+" is : "+index);
	    
	}

}
		
		
		
		
		
		
		
		
		