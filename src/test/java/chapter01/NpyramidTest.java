package chapter01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NpyramidTest {

  @Test
  public void test() throws Exception {
    String expected =
      "   1\n" +
      "  222\n" +
      " 33333\n" +
      "4444444\n";

    assertEquals(expected, Npyramid.get(4));
  }

}