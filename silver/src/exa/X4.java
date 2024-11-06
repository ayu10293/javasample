package exa;//49

import java.util.ArrayList;
import java.util.Collection;

public class X4 {
	<T> Collection<T> foo(Collection<T> c) {
		return c;
	}
}

class Child extends X4 {
	<T> Collection<T> foo(Collection<T> c) {
		return c;
	}
	//2<T> List<T> foo(List<T> c) {return null;}
	//3<T> List<T> foo(Collection<String> c);
	//4<T> Collection<T> foo(Map c){return null;}
}

 class Main2 {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<>();
		c.add("1");
		c.add("2");
		System.out.println(c);
		X4 x4 = new X4();
		Collection <String> c2 = x4.foo(c);
		System.out.println(c2);
		
		Child child = new Child();
		Collection<String> result = child.foo(c);
		System.out.println(result);
	}
}