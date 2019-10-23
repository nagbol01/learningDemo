package one;

public class WalletTester {

  public static void main(String[] args) {
    Wallet test = new Wallet();
    test.addCard("tii", 50664, 250);
    test.addCard("kano", 250);
    test.addCard("bimbo",585,"23/10/19");

    Wallet test2 = new Wallet();
    test2.addCard("bimbo",585,"23/10/19");
    test2.addCard("kano", 250);

    Wallet test3 = new Wallet();
    test3.addCard("bimbo",585,"23/10/19");

    System.out.println(test.formatCards());
    System.out.println(test2.formatCards());
    System.out.println(test3.formatCards());


  }

}
