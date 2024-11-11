package exa;
abstract class Super{
	int num;
	Super(){
		System.out.println(num);
	}
	Super(int num){
		this.num = num;
	}
	void method() {
		System.out.println("Super:method");
	}
}
class Sub extends Super{
	protected void method() {
		System.out.println("Sub:method");
	}
}
public class X11 {

	public static void main(String[] args) {
		new Sub();
	}

}
