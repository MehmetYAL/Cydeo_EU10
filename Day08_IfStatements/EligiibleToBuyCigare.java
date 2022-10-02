package Day08_IfStatements;

public class EligiibleToBuyCigare {
    public static void main(String[] args) {


    byte age =20;
    char Gender= 'M';
    boolean Must= age>=21 && Gender=='M';
  if (Must){
      System.out.println("Allowed to buy cigare");

  }else {
      System.out.println("not allowed to buy sigare");
}
    }
}
