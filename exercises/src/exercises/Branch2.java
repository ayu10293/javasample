package exercises;

public class Branch2{
  public static void main(String[] args){
    int price = Integer.parseInt(args[0]);
    double rate = 0.10;         // 消費税10%;
    int discount, amount, purchase;
    
    purchase = (int)(price * (1 + rate));

    if( purchase >= 5000 ){        // 値引きの設定
      discount = 500;
    } else if( price >= 3000 ){
      discount = 300;
    } else {
      discount = 0;
    }

    amount = (int)((price) * (1 + rate)- discount);
    
    System.out.println("入力金額" + price + "円");
    System.out.println("値引き前金額" + purchase + "円");
    System.out.println("値引き金額" + discount + "円");
    System.out.println("税込み価格" + amount + "円");
    
    System.out.println("もし購入価格が5000円以上なら500円値引き");
    System.out.println("もし購入価格が3000円以上なら300円値引き");
    System.out.println("それ以外なら値引きはなし");
  }
}
