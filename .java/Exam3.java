package exam;


public class Exam3 {
	public static void main(String[] args) {
		
		int a1 = getSquareArea(3, 3);//四角形
		System.out.println(a1);
		
		double a2 = getTriangleArea(3, 3);//三角形
		System.out.println(a2);
	}
	public static int getSquareArea (int vertical, int horizontal) {  //四角形メソッド
		return vertical * horizontal;//四角形の公式
	}
	public static double getTriangleArea (double base, double height) {  //三角形メソッド
		return base * height /2;//三角形の公式
	}
	

}
