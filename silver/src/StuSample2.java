public class StuSample2{
  public static void main(String[] args){
    Student2 stu = new Student2();
    Teacher2 tea = new Teacher2();
    
    stu.setName("菅原");    
    stu.setStuNo(1);
    stu.display();
    
    tea.setName("山田");
    tea.setTeaNo(8);
    tea.display();
  }
}
