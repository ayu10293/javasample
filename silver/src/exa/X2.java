package exa;//mogi47
import java.util.function.Supplier;
public class X2 {
	public static void main(String[] args) {
		int i = 25;
		Supplier<Integer> s = () -> i;
		//i++;
		System.out.println(s.get());
	}
}
