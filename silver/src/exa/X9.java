package exa;

import java.util.Arrays;

public class X9 {

	public static void main(String[] args) {
		String[] ary = { "banana", "apple", "orange" };
		var list = Arrays.asList(ary);
		list.sort((o1, o2) -> o2.compareTo(o1));
		System.out.println(list);

	}

}
