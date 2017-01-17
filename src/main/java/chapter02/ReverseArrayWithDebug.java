package chapter02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArrayWithDebug {

  public static int[] reverse(int[] a) {
    int[] result = a.clone();
    printCurrentStatus(result);
    for (int i = 0; i < a.length / 2; i++) {
      printExchangingIndices(i, a.length - i - 1);
      result = swap(result, i, a.length - i - 1);
      printCurrentStatus(result);
    }
    System.out.println("Done!");
    return result;
  }

  private static int[] swap(int[] a, int idx1, int idx2) {
    int[] result = a.clone();
    int tmp = result[idx1];
    result[idx1] = result[idx2];
    result[idx2] = tmp;
    return result;
  }

  private static void printExchangingIndices(int idx1, int idx2) {
    System.out.println(String.format("Exchanging [%d] for [%d]", idx1, idx2));
  }

  private static void printCurrentStatus(int[] a) {
    Arrays.stream(a).forEach(i -> System.out.print(i + " "));
    System.out.println();
  }

  private List<String> handlers;

  public void handlers(String... args) {
    handlers(Arrays.stream(args).collect(Collectors.toList()));
//    return (T) this;
  }

  public void handlers(List args) {

  }
}
