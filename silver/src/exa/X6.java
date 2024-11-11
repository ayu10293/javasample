package exa;
class Foo{
	int a = 10;
	void methodA(Integer i) {a += i;}
	void methodB(StringBuilder sb) {sb.append(" " + sb);}
	
}

public class X6 {
	public static void method() {
		System.out.println("abc");
	}
	public static void main(String[] args) {
		Foo obj = new Foo();
		int val = 10;
		obj.methodA(val);
		StringBuilder sb = new StringBuilder("hello");
		obj.methodB(sb);
		System.out.println(val + " : " + sb.toString());
		
	}

}//appendメソッドはStringBuilderに文字列や他のデータを追加,toStringメソッドはStringBuilderの現在の内容をString型で返します。
