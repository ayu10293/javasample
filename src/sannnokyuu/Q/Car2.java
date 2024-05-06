package sannnokyuu.Q;

public class Car2 {
		int no;
		int speed;
		
		Car2(int n) {
			no = n;
		}
		Car2(){
			no = 0;
		}
		void run(int s) {
			speed = s;
		}
		void brake() {
			speed = 0;
		}
		void brake(int s) {
			speed = speed - s;
		}
		void display() {
			System.out.println("ナンバー" + no + "の速度は" + speed + "です。");
		}
}
