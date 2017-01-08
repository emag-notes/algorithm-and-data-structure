package chapter01;

public class Square {

  public static String get(int n) {
    StringBuilder table = new StringBuilder();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        table.append('*');
      }
      table.append(System.lineSeparator());
    }

    return table.toString();
  }

}
