package one;

public class cardTester {
  public static void main(String[] args) {
    Card test = new Card("taiwo");
    CallingCard tester = new CallingCard("tii", 50664, 55);
    IDCard tester1 = new IDCard("tango", 65625);
    DriverLicense tester2 = new DriverLicense("ORORO", 8955, "10/01/19");
    System.out.println(test.format());
    System.out.println(tester.format());
    System.out.println(tester1.format());
    System.out.println(tester2.format());
  }
}
