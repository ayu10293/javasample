package silver;

import java.util.function.Supplier;

public class Q4_Sample {
	void sample() {
		final int i = 0;
		Supplier<Integer> foo = () -> i;
		System.out.println(foo.get());
	}
}
