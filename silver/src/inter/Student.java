package inter;

public class Student implements English {
	private String name;
	private Clab club;

	public Student(String name,Clab clab) {
		this.name = name;
		this.club = clab;
	}

	public void display() {
		System.out.println(name);
		club.display();
	}

	public void practice() {
		club.practice();
	}
	public void level() {
		club.level();
	}
	public void Eng() {
		
	}
}
