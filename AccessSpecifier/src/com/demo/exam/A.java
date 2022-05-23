package com.demo.exam;


	class A 
	{
	    public int GetResult(int a, int b) { return 0; }//The code doesn't compile because the method GetResult() 
	    //in class A is final and so cannot be overridden
	} 
	class B extends A 
	{ 
	    public int GetResult(int a, int b) {return 1; } 
	} 
	


