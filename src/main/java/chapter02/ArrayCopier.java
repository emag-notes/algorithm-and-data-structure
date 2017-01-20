package chapter02;

public class ArrayCopier {

  public static void copy(int[] a, int[] b) {
    System.arraycopy(b, 0, a, 0, (a.length < b.length) ? a.length : b.length);
  }

  public static void rcopy(int[] a, int[] b) {
    int copiedLength = (a.length < b.length) ? a.length : b.length;

    for (int i = 0; i < copiedLength; i++) {
      a[i] = b[b.length - i - 1];
    }
  }

}
