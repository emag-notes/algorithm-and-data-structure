package chapter01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

  @Test
  public void testLB() throws Exception {
    String expected =
      "*\n" +
      "**\n" +
      "***\n" +
      "****\n" +
      "*****\n";

    assertEquals(expected, Triangle.leftBottom(5));
  }

  @Test
  public void testLU() throws Exception {
    String expected =
      "*****\n" +
      "****\n" +
      "***\n" +
      "**\n" +
      "*\n";

    assertEquals(expected, Triangle.leftUp(5));
  }

  @Test
  public void testRB() throws Exception {
    String expected =
      "    *\n" +
      "   **\n" +
      "  ***\n" +
      " ****\n" +
      "*****\n";

    assertEquals(expected, Triangle.rightBottom(5));
  }

  @Test
  public void testRU() throws Exception {
    String expected =
      "*****\n" +
      " ****\n" +
      "  ***\n" +
      "   **\n" +
      "    *\n";

    assertEquals(expected, Triangle.rightUp(5));
  }

}