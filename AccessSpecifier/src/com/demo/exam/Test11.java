package com.demo.exam;

public class Test11 {

	
		
		void A() /* Line 3 */
	    {
	        System.out.println("Class A"); 
	    } 
	    public static void main(String[] args) 
	    { 
	        new A(); 
	    } 

	}

//The specification at line 3 is for a method and not a constructor
//and this method is never called therefore there is no output. 
//The constructor that is called is the default constructor.
