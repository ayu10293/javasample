public class StuSample6{
  public static void main(String[] args){
    TandF taf = new TandF("陸上競技部");//オブジェクトの生成とコンストラクタに値を代入し、初期化
    Football fb = new Football("サッカー部");//オブジェクトの生成とコンストラクタに値を代入し、初期化
    
    Student6 stu1 = new Student6("菅原",taf);//オブジェクトの生成とコンストラクタに値を代入し、初期化
    stu1.display();
    stu1.practice();
    
    Student6 stu2 = new Student6("桜井",fb);//オブジェクトの生成とコンストラクタに値を代入し、初期化
    stu2.display();
    stu2.practice();

  }
}
