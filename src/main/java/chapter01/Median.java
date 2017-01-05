package chapter01;

public class Median {

  public static int med3(int a, int b, int c) {
    if (a >= b) {
      if (b >= c) { return b; }
      if (c >= a) { return a; }
      return c;
    }

    if (a > c) { return a; }

    if (b > c) { return c; }

    return b;
  }

}
