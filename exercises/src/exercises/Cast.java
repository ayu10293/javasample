package exercises;

public class Cast{
  public static void main(String[] args){
    int price = Integer.parseInt(args[0]);
    double rate = 0.08;         // 消費税8%
    int amount;

    //int  =       int   *      double  だからdoubleになる
    //        ↓キャスト演算子を入れて基本データ型の型変換をする。
    amount = (int)(price * (1 + rate));
    System.out.println("税抜き" + price + "円");
    
    System.out.println("税込金額" + amount + "円");
  }
}
