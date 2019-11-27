package wk9;

public class tester {

  public static void main(String[] args) {
    Triangle tester = new Triangle(5);
    System.out.println(tester.getArea());

    Reverse tester2 = new Reverse("abcde");
    System.out.println(tester2.reverseThis());

    String word = "abcdefg";
    System.out.println("Word: " + word);
    Reverse tester3 = new Reverse(word);
    System.out.println("Word reversed: " + tester3.reverseThis());

  }

}
