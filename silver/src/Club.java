public abstract class Club{
  private String name;     // 部活名

  public Club(String name){//コンストラクタ（クラス名と同じ（大文字になる）、戻り値を書かない）
    this.name = name;
  }
  public void display(){
    System.out.println("部活動" + name);
  }
  public abstract void practice();
}
