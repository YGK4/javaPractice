package structure.class1.methods;

public class LocalVariabale {
	
	static int a=100;
	//int b = 200;

	public void var() {
	int b;
		if(true) {
			
			b = 300;
			
		}
		System.out.println(b);
	}

	public void abc() {

	//	System.out.println(b);
	}

	public static void main(String[] args) {

		LocalVariabale loc = new LocalVariabale();
		loc.var();
		loc.abc();
	}

}
