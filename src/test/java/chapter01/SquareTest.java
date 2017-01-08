package chapter01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

  @Test
  public void test() throws Exception {
    String expected =
      "*****\n" +
      "*****\n" +
      "*****\n" +
      "*****\n" +
      "*****\n";

    assertEquals(expected, Square.get(5));
  }

}