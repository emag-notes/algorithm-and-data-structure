package chapter01;

public class MultiplicationTable {

  public static String get() {
    StringBuilder table = new StringBuilder();

    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        table.append(String.format("%3d", i * j));
      }
      table.append(System.lineSeparator());
    }

    return table.toString();
  }

}
