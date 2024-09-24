package q;

public class Sample1 {
	
	private int c;
	
	public Sample1(int a, int b) {
		this.c = a + b * a * b - a - b;
	}
	void display() {
		System.out.println(this.c);
	}
	
}
