package student;
public class NonObject3{
  public static void main(String[] args){
	  Student3 stu1 = new Student3("佐藤");
	  Student3 stu2 = new Student3("伊藤", 56, 80);
	  
	  stu1.setScore (100,70);
	  
	  stu1.display();
	  stu2.display();
	  
	  
	  
  }
}
