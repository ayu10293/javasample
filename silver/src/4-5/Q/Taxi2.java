class Taxi extends Car1{
  Taxi(){
    this(9999);
    System.out.println("Taxi()");
  }
  Taxi(int no){
    super(no);
    System.out.println("Taxi(int no)");
  }
  Taxi(String no){
    System.out.println("Taxi(String no)");
  }
}
