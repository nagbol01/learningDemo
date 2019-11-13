package wk7;

public class testing {

  /**
   * A class to test codes in the class.
   */
  public static void main(String[] args) {
    Pair<Integer,String> p1 = new Pair<Integer, String>(42, "tango");
    System.out.println(p1.getCap()+" "+p1.getNoCap());
    Pair<String,Integer> p2 = p1.swap();
    System.out.println(p2.getCap()+" "+p2.getNoCap());
  }
}

