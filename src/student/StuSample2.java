package student;
class StuSample2{
  public static void main(String[] args){
    Student2 stu1 = new Student2();
    Student2 stu2 = new Student2();

    stu1.setData("����");
    stu1.setScore(90, 80);
    stu1.display();

    stu2.setData("���R", 75, 100);
    stu2.display();
  }
}
