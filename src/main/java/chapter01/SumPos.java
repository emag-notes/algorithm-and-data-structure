package chapter01;

import java.util.stream.IntStream;

public class SumPos {

  public static int sum(int n) {
    if (n <= 0) {
      throw new IllegalArgumentException("arg must be positive number");
    }

    return IntStream.rangeClosed(1, n).sum();
  }

}
