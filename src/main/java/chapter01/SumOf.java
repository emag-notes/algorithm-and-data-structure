package chapter01;

import java.util.stream.IntStream;

public class SumOf {

  public static int sum(int a, int b) {
    int min = (a < b) ? a : b;
    int max = (a < b) ? b : a;

    return IntStream.rangeClosed(min, max).sum();
  }

}
