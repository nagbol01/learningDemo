public class testing4 {

  public static void main(String[] args) {

    int[] D = {1, 2, 2, 5, 7, 7, 7, 8, 8, 8, 8, 9, 9};
    int n = D.length;
    for (int i = 0; i < n; i++) {
      int j;
      for (j = 0; j < i; j++)
        if (D[i] == D[j])
          break;
        if (i == j)
          System.out.print(D[i]+" ");
    }
  }
}