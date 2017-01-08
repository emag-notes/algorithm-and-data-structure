package chapter01;

public class Npyramid {

  public static String get(int n) {
    StringBuilder pyramid = new StringBuilder();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        pyramid.append(' ');
      }
      for (int j = 1; j <= (i - 1) * 2 + 1 ; j++) {
        pyramid.append(i % 10);
      }
      pyramid.append(System.lineSeparator());
    }
    return pyramid.toString();
  }

}
