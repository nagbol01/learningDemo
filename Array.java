import java.util.Scanner;

public class Array {

  public static void main(String[] args) {
    final int LENGTH = 5;
    double[] values = new double[LENGTH];
    int currentSize = 0;
    Scanner in = new Scanner(System.in);
    while (in.hasNextDouble()) {
      if (currentSize < values.length) {
        values[currentSize] = in.nextDouble();
        currentSize++;
      }
    }

    for (double i : values
    ) {
      System.out.println(i);
    }
  }

  public static void main(String[] args) {
    double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
    int xLength = x.length;
    System.out.println(xLength);
    System.out.println(x[0]);
    System.out.println(x[8]);
    System.out.println(x[xLength - 1]);

    for (int i = 0; i < xLength; i++) {
      System.out.println(x[i]);
    }

    for (int i = 0; i < xLength; i++) {
      System.out.println("x[" + i + "] = " + x[i]);
    }

    for (int i = 8; i >= 0; i--) {
      System.out.println("x[" + i + "] = " + x[i]);
    }

    for (double i : x
    ) {
      System.out.println(i);
    }
}
