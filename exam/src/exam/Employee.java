package exam;

public class Employee {

		private String name;
	    private int age;

	    // コンストラクタ
	    public Employee(String name, int age) {//社員の名前と年齢を初期化
	        this.name = name;
	        this.age = age;
	    }

	    // ゲッターとセッター
	    public String getName() {//名前を取得、設定
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {//年齢を取得、設定
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    // 社員情報を出力するメソッド
	    public void introduce() {
	        System.out.println(name + "さんは" + age + "歳です");
	    }
}
