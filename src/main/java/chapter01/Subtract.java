package chapter01;

public class Subtract {

  public static int subtract(int a, int b) {
    if (b < a) {
      throw new IllegalArgumentException("arg 2 must be larger than arg 1");
    }

    return b - a;
  }

}
