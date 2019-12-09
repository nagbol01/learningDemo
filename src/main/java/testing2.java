public class testing2 {
  public static void main(String[] args) {

    int[] B = {1, 2, 2, 5, 7, 7, 7, 8, 8, 8, 8};

    int max_count = 1, res = B[0], curr_count = 1;
    for (int i = 1; i < B.length; i++) {
      if (B[i] == B[i - 1])
        curr_count++;
      else {
        if (curr_count > max_count) {
          max_count = curr_count;
          res = B[i - 1];
        }
        curr_count = 1;
      }
    }

    // If last element is most frequent
    if (curr_count > max_count)
    {
      max_count = curr_count;
      res = B[B.length - 1];
    }

    System.out.println(res);
  }
}
