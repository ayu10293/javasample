package silver;

public class Manager extends Employee {
	// 継承を使ってクラスを修正してください
	
	private int bonus;
	
	Manager(){
		this("マネ",01,10000);
	}

	public Manager(String name, int id, int bonus) {
		// コンストラクタを修正してください
		super(name, id);
		this.bonus = bonus;
	}

	@Override
	public void display() {
		// メソッドをオーバーライドしてください
		super.display();
		System.out.println("Bonus:" + bonus);
	}

	public static void main(String[] args) {
		Manager m1 = new Manager("Bob", 123, 5000);
		m1.display();
		
		Manager m0 = new Manager();
		m0.display();
		
		Employee e0 = new Employee();
		e0.display();
	}
}
