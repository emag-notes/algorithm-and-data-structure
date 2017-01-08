package chapter01;

import java.util.concurrent.atomic.AtomicInteger;

public class SumWhile {

  static AtomicInteger i = new AtomicInteger(1);

  public static int sum(int n) {
    int sum = 0;

    while (i.get() <= n) {
      sum += i.getAndIncrement();
    }

    return sum;
  }

}
