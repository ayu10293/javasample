package exa;//58

//class Q{
//	final double num;
//	Q(String num){
//		this.num = Double.parseDouble(num);
//	}
//	Q(int num){
//		this.num = num;
//	}
//	Q(){}
//	double getNum() {
//		return num;
//	}
//}
//public class X10 {
//	public static void main(String[] args) {
//		System.out.println(new Q("123.45").getNum());
//		System.out.println(new Q(123).getNum());
//	}
//
//}
class A {
	final double num;

	A(String num) {
		this.num = Double.parseDouble(num);
	}

	A(int num) {
		this.num = num;
	}

	A() {}
	double getNum() {
		return num;
	}
}

public class X10 {
	public static void main(String[] args) {
		System.out.println(new A("123.45").getNum());
		System.out.println(new A(123).getNum());
	}
}
