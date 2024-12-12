package coreJava;

import com.sample.examples.Inheritancechild;

public class DataHandling {
	String a = "Java Program";
	static int l=30;
	int offer;
	
	public DataHandling() {// constructer
	
		offer=10;
		System.out.println(a);
	}
	public DataHandling(int a,int b) // parameterized constructer
	{
		offer=20;
	}

	public void getOffers() {
		int c = offer + 20;
		System.out.println(c);
	}
	
	public void add(int a,int b) // method overloading
	{
		
	}

	public static void main(String[] args) {
		DataHandling dataHandling_14= new DataHandling();
	
		System.out.println(l);
		dataHandling_14.l=40;
		System.out.println(l);

		DataHandling dataHandling = new DataHandling(10,20);

		dataHandling.l=50;

		System.out.println(l);
		System.out.println(dataHandling_14.l);
		Inheritancechild inheritancechild = new Inheritancechild();
		inheritancechild.
	}

}
