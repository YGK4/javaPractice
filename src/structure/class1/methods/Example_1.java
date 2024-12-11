package structure.class1.methods;

public class Example_1 {
	
	int id;
	String name;
	public  Example_1(int i, String n) {
		id= i;
		name=n;
		
	}
	public void display () {
		System.out.println(id+" "+name);
		
	}

	public static void main(String[] args) {
		Example_1 example1 =new Example_1(100, "karan");
         example1.display();
         Example_1 example2 =new Example_1(100, "karanfgh");
         example2.display();
	}
	

}
