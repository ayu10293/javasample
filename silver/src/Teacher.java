public class Teacher extends Person{
	private int teacherNo;
	
	public void setTeaNo(int t) {
	  teacherNo = t;
	}
	public void displayTeaNo() {
	  System.out.println("教師番号" + teacherNo);
	}
}
