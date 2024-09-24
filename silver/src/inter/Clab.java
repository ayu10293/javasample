package inter;

public abstract class Clab {
	private String name;

	public Clab(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println(name);
	}

	public abstract void practice();
	
	public abstract void level();
}
