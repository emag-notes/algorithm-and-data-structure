package chapter01;

public class MultiplicationTable2 {

  public static String get() {
    StringBuilder table = new StringBuilder();
    TableDecorator.appendHeader(table);

    for (int i = 1; i <= 9; i++) {
      TableDecorator.appendRowHeader(table, i);
      for (int j = 1; j <= 9; j++) {
        table.append(String.format("%3d", i * j));
      }
      table.append(System.lineSeparator());
    }

    return table.toString();
  }

}
