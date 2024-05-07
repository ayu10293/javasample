public class Teacher3 extends Person3{
	private int teaNo;
	
	public Teacher3(String name) {
		this(name,888);
	}
	public Teacher3(String name, int teaNo) {
		super(name);
		this.teaNo = teaNo;
	}
	
	public void display() {
		super.display();
		System.out.println("教師番号:" + teaNo);
	}
}
