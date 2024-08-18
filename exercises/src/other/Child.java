package other;
import ex26.Parent;

public class Child extends Parent {

	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		System.out.println(p1.num);
		
		Child c1 = new Child();
		System.out.println(c1.num);
	}

}
