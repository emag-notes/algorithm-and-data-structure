package chapter02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTest {

  @Test
  public void test() throws Exception {
    int[] a = {12, 33, -5, 2, 49};
    assertEquals(91, SumOf.sumOf(a));
  }

}