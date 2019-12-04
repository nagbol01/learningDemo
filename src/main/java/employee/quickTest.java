package employee;

import java.util.ArrayList;

public class quickTest {

  public static void main(String[] args) {
    //put your code here
    Employee erica = new Employee("Erica");
    Employee derek = new Employee("Derek", erica);
    Employee celia = new Employee("Celia", derek);
    Employee barry = new Employee("Barry", celia);

    System.out.println(barry.getCEO());
    System.out.println(erica.getCEO());

    System.out.println(barry.getCEOLoop());
    System.out.println(erica.getCEOLoop());

    System.out.println(barry.getCommandChain());
    System.out.println(erica.getCommandChain());
    System.out.println(celia.getCommandChain());
  }
}

