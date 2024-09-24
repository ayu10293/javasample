package inter;

public class Main {

	public static void main(String[] args) {
		TandF taf = new TandF("陸上競技部");
		Football fb = new Football("サッカー部");
		
		Student stu1 = new Student("Aさん", taf);
		stu1.display();
		stu1.level();
		stu1.practice();
		
		Student stu2 = new Student("Bさん", fb);
		stu2.display();
		stu2.level();
		stu2.practice();
		
		Student stu3 = new Student("Cさん", taf);
		stu3.display();
		stu3.level();
		stu3.practice();
	}

}
