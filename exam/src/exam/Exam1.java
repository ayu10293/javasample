package exam;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {	
		
		
		   Scanner scan = new Scanner(System.in);
		   
		   
		   System.out.println("名前 :");
		   String name = scan.nextLine(); //名前を入力してもらう
		   
		   System.out.println("年齢 :");
		   int age = Integer.parseInt(scan.nextLine()); //年齢を入力してもらう
		   
		   int ageAfter10YearsOld = age + 10; //10年後の年齢＝age（25）+10
		   
		   System.out.println(name + "さんの10年後は" + ageAfter10YearsOld + "歳です！");
		   
		   scan.close();

	}

}
