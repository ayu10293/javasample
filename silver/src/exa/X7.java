package exa;

public class X7 {
	public static void foo(String... args) {
		System.out.println("hello");
		for(String s : args) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		X7 obj = null;
		obj.foo("ppp");
	}

}
//結果hello