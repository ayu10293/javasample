package silver;

public class D {

	public static void main(String[] args) {
		String[] array = {"A","B","C"};
		for (String str : array) {
			str = "D";
			System.out.println(str);
		}
		for (String str : array) {
			System.out.println(str);
		}
	}

}
