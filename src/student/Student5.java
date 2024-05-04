package student;
public class Student5{
  private String name;
  private int score;

  public Student5(String n){
    name = n;
  }
  public void setScore(int s){
    if(0 <= s && s <= 100){
      score = s;
    } else {
      System.out.println(name + "����̓_�����͈͊O�ł�");
      score = 0;
    }
  }
  void display(){
    System.out.println(name + "����F" + score + "�_");
  }
}
