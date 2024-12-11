package structure.class1.methods;

public class Datahandling_practice {
	static int d = 20;
	int b = 30;
	int offer;

	public Datahandling_practice() {
		offer = 20;
		System.out.println(offer);
	}

	public Datahandling_practice(int x, int y) {
		offer = 20;
		System.out.println(offer);
		int c = x;
		int s = y;
		System.out.println(c + s);
	}

	public static void main(String[] args) {

		Datahandling_practice datahandlingpractice = new Datahandling_practice();

		Datahandling_practice datahandlingpractice2 = new Datahandling_practice(230,30);

	}

}
