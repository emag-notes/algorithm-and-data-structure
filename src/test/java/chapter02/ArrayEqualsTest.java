package chapter02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayEqualsTest {

  @Test
  void should_be_true() throws Exception {
    int[] a = {10, 73, 2, -5, 42};
    int[] b = {10, 73, 2, -5, 42};
    assertTrue(ArrayEquals.equals(a, b));
  }

  @Test
  void should_be_false_when_each_length_is_different() throws Exception {
    int[] a = {10, 73, 2, -5, 42};
    int[] b = {10, 2, -5, 42};
    assertFalse(ArrayEquals.equals(a, b));
  }

  @Test
  void should_be_false_when_each_element_is_different() throws Exception {
    int[] a = {10, 73, 2, -5, 42};
    int[] b = {10, 73, 5, -5, 42};
    assertFalse(ArrayEquals.equals(a, b));
  }
}