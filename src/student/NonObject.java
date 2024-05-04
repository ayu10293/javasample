package student;
public class NonObject{
  public static void main(String[] args){
	  Student stu1 = new Student();
	  
	  stu1.name = "菅原";
	  stu1.setScore (100,70);
	  
	  stu1.display();
	  System.out.println(stu1.getAvg());
	  
	  
	  
  }
}
