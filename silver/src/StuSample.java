public class StuSample{
  public static void main(String[] args){
    Student stu = new Student();
    Teacher tea = new Teacher();

    // スーパークラスのメソッド
    stu.setName("菅原");    
    stu.display();

    // サブクラスのメソッド
    stu.setStuNo(1);
    stu.displayStuNo();
    
    tea.setName("佐藤");
    tea.display();
    
    tea.setTeaNo(5);
    tea.displayTeaNo();
  }
}
