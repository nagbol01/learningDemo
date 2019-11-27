package wk9;

public class Reverse {

  private String testToReverse;

  public Reverse(String testToReverse) {
    this.testToReverse = testToReverse;
  }

  public String reverseThis() {
    if (this.testToReverse.length() == 1) {
      return this.testToReverse;
    }

    Reverse newReverse = new Reverse(this.testToReverse.substring(1));
    return newReverse.reverseThis() + this.testToReverse.charAt(0);
  }

  public static String reverse(String a) {
    if (a.length() == 1) {
      return a;
    }

    Reverse newReverse = new Reverse(a.substring(1));
    return newReverse.reverse(a.substring(1)) + a.charAt(0);
  }

  public static void main(String[] args) {

    String word = "abcdefg";
    System.out.println("Word: " + word );
    System.out.println("Word reversed: " + reverse(word));
  }
}
