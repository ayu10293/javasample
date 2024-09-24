package silver;

public class Employee {
	private String name;
	private int id;
	
	Employee(){
		this("名前",0);
	}

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public void display() {
		System.out.println("Employee Name: " + name + ", ID: " + id);
	}
}
