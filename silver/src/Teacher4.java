public class Teacher4 extends Person4 {
	private int teaNo;

	public Teacher4(String name, int teaNo) {
		super(name);
		this.teaNo = teaNo;
	}

	public void display() {
		super.display();
		System.out.println("教師番号:" + teaNo);
	}
}
