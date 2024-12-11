package structure.class1.methods;

public class Javaclass {
	int a;
	int b;
	int c;

	public void add() {

		a = 10;

	}

	public void addd() {

		b = 20;
	}

	public void adddd() {

		c = a + b;

		System.out.println(c);
	}

	public static void main(String[] args) {
		Javaclass j = new Javaclass();
		j.add();
		j.addd();
		j.adddd();
	}

}
