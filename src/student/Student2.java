package student;
public class Student2{
  String name;
  int engScore;
  int mathScore;

  void setData(String n){
    name = n;
  }
  void setData(String n, int e, int m){
    name = n;
    engScore = e;
    mathScore = m;
  }
  void setScore(int e, int m){
    engScore = e;
    mathScore = m;
  }
  double getAvg() {
	double avg = engScore + mathScore /2.0;
	return avg;
  }
  void display(){
    System.out.println(name);
    System.out.println("ENG" + engScore + "MATH" + mathScore);
  }
}
