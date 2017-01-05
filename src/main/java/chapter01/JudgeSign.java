package chapter01;

public class JudgeSign {

  public static Sign judge(int n) {
    if (n > 0) return Sign.POSITIVE;
    if (n < 0) return Sign.NEGATIVE;
    return Sign.ZERO;
  }

}
