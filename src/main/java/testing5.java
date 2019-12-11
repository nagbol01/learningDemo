public class testing5 {

  public static boolean distint3(int[] arr) {
    if (arr[0] == arr[arr.length - 1]) {
      return false;
    } else {
      int a = arr[0];
      int b = arr[arr.length - 1];
      int start = 0;
      int last = arr.length - 1;

      while (last - start > 1) {
        int middle = (start + last) / 2;
        if (arr[middle] != a && arr[middle] != b) {
          return true;
        } else if (arr[middle] == a){
          start = middle + 1;
        } else if (arr[middle] == b){
          last = middle - 1;
        }
      }
      return false;
    }
  }

  public static void main(String[] args) {
    int[] n = {1, 3, 4};
    if (distint3(n) == true) {
      System.out.println("YES");
    } else{
      System.out.println("NO");
    }
  }
}
