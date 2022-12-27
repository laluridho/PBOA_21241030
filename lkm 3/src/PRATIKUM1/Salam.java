package PRATIKUM1;

public class Salam {
 String slm = "Assalamualikum...";

 public void info1(){
    System.out.println(slm);
}
}
class PangilSalam extends Salam{
  String salamku = "Salam sejahtera untuk kita semua";

 public void info2(){
    System.out.println(salamku);
}
 public static void main(String[] args) throws Exception {
  PangilSalam obj = new PangilSalam();
    obj.info1();
    obj.info2();
    }
}

  

