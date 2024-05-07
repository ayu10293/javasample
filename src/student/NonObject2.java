package student;//オーバーロード
public class NonObject2{
  public static void main(String[] args){
	  Student2 stu1 = new Student2();
	  Student2 stu2 = new Student2();
	  
	  stu1.setData("菅原");
	  stu1.setScore(80, 95);
	  stu2.setData("菅野",100,70);
	  
	  stu1.display();
	  stu2.display();
	  System.out.println(stu1.getAvg());
	  System.out.println(stu2.getAvg());
	  
	  
  }
}
