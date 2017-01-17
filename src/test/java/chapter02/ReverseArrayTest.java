package chapter02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseArrayTest {

  @Test
  public void test() throws Exception {
    int[] input = {10, 73, 2, -5, 42};
    int[] result = ReverseArray.reverse(input);

    assertEquals(42, result[0]);
    assertEquals(-5, result[1]);
    assertEquals( 2, result[2]);
    assertEquals(73, result[3]);
    assertEquals(10, result[4]);
  }

}