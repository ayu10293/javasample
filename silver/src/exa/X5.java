package exa;

public class X5 {
	void set(Collection<String> set) {}
}
class Child2 extends X5{
	void method(Map<Integer, String> map) {
		super.set(map.values());
	}
}
k