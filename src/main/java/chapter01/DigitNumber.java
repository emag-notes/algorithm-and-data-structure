package chapter01;

public class DigitNumber {

  public static int check(int n) {
    int digitNumber = 0;

    while (0 < n) {
      n /= 10;
      digitNumber++;
    }

    return digitNumber;
  }

}
