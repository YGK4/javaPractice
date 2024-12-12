package com.sample.examples;

public class Inheitancechildlearn extends Inheritanceparentlearn {
	

	//public Inheitancechildlearn() {
		//super(20,30);
		
	//}
	
	public void add(int x,int y,int z) {
		int a=x;
		  int b=y;
		  int c= z;
	  System.out.println(a+b+c);
	  
 }
	public static void main(String [] args) {
		
		Inheitancechildlearn inc = new Inheitancechildlearn();
		inc.add(20,30);
		
	}
}
