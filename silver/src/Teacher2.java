public class Teacher2 extends Person2{
	private int teaNo;
	
	public void setTeaNo (int t){
		teaNo = t;
	}
	
	public void display() {
		System.out.println("教師名:" + getName());
		System.out.println("教師番号:" + teaNo);
		System.out.println("オーバーライド");
		System.out.println("サブクラスでスーパークラスのメソッドを再定義する");
		System.out.println("戻り値の型、メソッド名、引数の型と数　をすべて同じにする。");
	}
}
