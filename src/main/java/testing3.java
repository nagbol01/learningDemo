public class testing3 {

  public static void main(String[] args) {

    int[] C = {1, 2, 2, 5, 7, 7, 7, 8, 8, 8, 8};
    int n = C.length;
    for (int i = 0; i < n; i++) {
      while (i < n - 1 && C[i] == C[i + 1]) {
        i++;
      }
      System.out.print(C[i] + " ");
    }
  }
}
