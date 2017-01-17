package chapter02;

import java.util.Arrays;

public class SumOf {

  public static int sumOf(int[] a) {
    return Arrays.stream(a).sum();
  }

}
