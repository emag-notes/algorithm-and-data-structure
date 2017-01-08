package chapter01;

public class Triangle {

  public static String leftBottom(int n) {
    StringBuilder triangle = new StringBuilder();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        triangle.append('*');
      }
      triangle.append(System.lineSeparator());
    }

    return triangle.toString();
  }

  public static String leftUp(int n) {
    StringBuilder triangle = new StringBuilder();

    for (int i = 1; i <= n; i++) {
      for (int j = i; j <= n; j++) {
        triangle.append('*');
      }
      triangle.append(System.lineSeparator());
    }

    return triangle.toString();
  }

  public static String rightBottom(int n) {
    StringBuilder triangle = new StringBuilder();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        triangle.append(' ');
      }
      for (int j = 1; j <= i; j++) {
        triangle.append('*');
      }
      triangle.append(System.lineSeparator());
    }

    return triangle.toString();
  }

  public static String rightUp(int n) {
    StringBuilder triangle = new StringBuilder();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j < i; j++) {
        triangle.append(' ');
      }
      for (int j = i; j <= n; j++) {
        triangle.append('*');
      }
      triangle.append(System.lineSeparator());
    }

    return triangle.toString();
  }

}
