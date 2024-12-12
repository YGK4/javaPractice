package com.sample.examples;

public class Inheritancechild extends InheritParent {

	  int varible=10;
	private Object examInheritancechild;

	
	public Inheritancechild() {
		super(10); //calling  super class constructer
		System.out.println("InheritanceExam____");
	}

	public void iphone14() { // over riding

		System.out.println("child class iphone14");
	}

	public void iphone14(int q) { //overloading

		System.out.println("child class iphone14");
	}

	public static void main(String[] args) {
		Inheritancechild examInheritancechild = new Inheritancechild();
		 examInheritancechild.iphone14();
		examInheritancechild.iphone14();
	}

}
