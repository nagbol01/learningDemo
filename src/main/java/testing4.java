public class testing4 {

  public static void main(String[] args) {

    int[] D = {1, 2, 2, 5, 7, 7, 7, 8, 8, 8, 8};
    int n = D.length;
    for (int i = 0; i < n; i++) {
      while (i < n - 1 && D[i] == D[i + 1]) {
        i++;
      }
      System.out.print(D[i] + " ");
    }
  }
}