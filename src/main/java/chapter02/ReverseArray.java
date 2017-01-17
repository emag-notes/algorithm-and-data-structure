package chapter02;

public class ReverseArray {

  public static int[] reverse(int[] a) {
    int[] result = a.clone();
    for (int i = 0; i < a.length / 2; i++) {
      result = swap(result, i, a.length - i - 1);
    }
    return result;
  }

  private static int[] swap(int[] a, int idx1, int idx2) {
    int[] result = a.clone();
    int tmp = result[idx1];
    result[idx1] = result[idx2];
    result[idx2] = tmp;
    return result;
  }

}
