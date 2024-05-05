package exam;
import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("年齢を入力してください: ");
		int age = 0; 
		
		while (true) { //真ならループ
            String input = scan.nextLine();//入力

            try {
                age = Integer.parseInt(input);//文字列を整数に変換してageに代入
                if (age < 0 || age > 130) {//この範囲を外れたら出力
                    System.out.println("0以上130以下で入力してください");
                } else {
                    System.out.println(age + "歳で登録しました");//条件を満たしたら出力
                    break;//おわり
                }
            } catch (NumberFormatException e) {//整数でなかったら出力
                System.out.println("整数で入力してください");
            }
        }

        scan.close();

	}

}
