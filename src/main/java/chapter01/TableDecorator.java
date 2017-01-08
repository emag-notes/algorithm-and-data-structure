package chapter01;

public class TableDecorator {

  public static void appendHeader(StringBuilder table) {
    table.append(String.format("%3s|", ""));
    for (int i = 1; i <= 9; i++) {
      table.append(String.format("%3d", i));
    }
    table.append(System.lineSeparator());

    table.append("---+");
    for (int i = 1; i <= 9; i++) {
      table.append("---");
    }
    table.append(System.lineSeparator());
  }

  public static void appendRowHeader(StringBuilder table, int rowNum) {
    table.append(String.format("%2d |", rowNum));
  }

}
