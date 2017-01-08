package chapter01;

public class SumProcess {

  public static String process(int n) {
    int sum = 0;
    StringBuilder process = new StringBuilder();

    for (int i = 1; i <= n; i++) {
      process.append(i);
      if (i != n) {
        process.append(" + ");
      }
      sum += i;
    }

    process.append(" = ").append(sum);

    return process.toString();
  }

}
