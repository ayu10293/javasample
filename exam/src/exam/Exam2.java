package exam;


public class Exam2 {
	public static void main(String[] args) {
		
		
			int[] array = {1, 5, 4, 3, 2};
			
	        for (int num : array) { //arrayから要素をnumに代入
	            if (num % 2 != 0) { //%2をして余りが0でない（奇数）の場合、代入
	                System.out.println(num); //代入された数字を出力
	            }
	        }

	}

}
