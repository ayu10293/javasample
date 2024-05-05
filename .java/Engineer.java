package exam;

public class Engineer extends Employee {

	private String skill;

    // コンストラクタ
    public Engineer(String name, int age, String skill) {
        super(name, age);
        this.skill = skill;
    }

    // ゲッターとセッター
    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    // オーバーライドしたintroduce()メソッド
    @Override
    public void introduce() {
        super.introduce();
        System.out.println(skill + "エンジニアです");
    }
}

