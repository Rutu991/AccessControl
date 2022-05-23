package com.demo.exam;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 class Foo 
	        {
	            public int i = 3;
	        } 
	        Object o = (Object)new Foo();
	        Foo foo = (Foo)o;
	        System.out.println("i = " + foo.i);
	    }

	}


