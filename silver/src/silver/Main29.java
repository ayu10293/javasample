package silver;

public class Main29 {

	public static void main(String[] args) {
		Sample29 s1 = new Sample29(10);
		Sample29 s2 = new Sample29(5);
		
		modify(s1);
		modify(s2);
		
		System.out.println("s1.num: " + s1.num);
		System.out.println("s2.num: " + s2.num);
	}

	private static void modify(Sample29 s) {
		// ここに条件に応じた処理を記述してください
		if(s.num < 10) {
			s.num *= 3;
		}
		else {
			s.num *= 2;
		}
	}

}