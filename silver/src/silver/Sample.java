package silver;

public class Sample {

	public static void main(String[] args) {
		int a = 10;
		int b = ++a + a + --a - a-- + a++;
		      //11    11 10     10    9
		System.out.println(b);
	}

}
