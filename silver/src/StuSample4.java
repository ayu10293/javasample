public class StuSample4 {
	public static void main(String[] args) {
		final int BASE_NO = 1000;
		Student4 stu1 = new Student4("菅原", BASE_NO + 1);
		stu1.display();
		Student4 stu2 = new Student4("村山", BASE_NO + 2);
		stu2.display();

		final int BASE_NO2 = 2000;
		Teacher4 tea1 = new Teacher4("原田", BASE_NO2 + 1);
		tea1.display();
		Teacher4 tea2 = new Teacher4("後藤", BASE_NO2 + 2);
		tea2.display();
	}
}
