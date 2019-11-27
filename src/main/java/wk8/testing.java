package wk8;

import java.util.ArrayList;
import java.util.List;


public class testing {

  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    list.add("Tom");
    list.add("Giles");
    list.add(1, "Laura");
    for (
        String s : list) {
      System.out.println(" " + s);
    }
    list.remove("Tom");
    System.out.println("after:");
    for (
        String s : list) {
      System.out.println(" " + s);
    }
  }

}
