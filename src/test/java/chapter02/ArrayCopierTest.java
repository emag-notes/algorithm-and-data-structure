package chapter02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayCopierTest {

  @Test
  void test_copy_when_a_b_size_is_equal() throws Exception {
    int[] a = {10, 73, 2, -5, 42};
    int[] b = {11, 74, 3, -4, 43};

    ArrayCopier.copy(a, b);

    assertEquals(11, a[0]);
    assertEquals(74, a[1]);
    assertEquals( 3, a[2]);
    assertEquals(-4, a[3]);
    assertEquals(43, a[4]);
  }

  @Test
  void test_copy_when_a_size_is_bigger_than_b() throws Exception {
    int[] a = {10, 73, 2, -5, 42};
    int[] b = {11, 74, 3, -4};

    ArrayCopier.copy(a, b);

    assertEquals(11, a[0]);
    assertEquals(74, a[1]);
    assertEquals( 3, a[2]);
    assertEquals(-4, a[3]);
    assertEquals(42, a[4]);
  }

  @Test
  void test_copy_when_a_size_is_smaller_than_b() throws Exception {
    int[] a = {10, 73, 2, -5};
    int[] b = {11, 74, 3, -4, 43};

    ArrayCopier.copy(a, b);

    assertEquals(11, a[0]);
    assertEquals(74, a[1]);
    assertEquals( 3, a[2]);
    assertEquals(-4, a[3]);
  }

  @Test
  void test_rcopy_when_a_b_size_is_equal() throws Exception {
    int[] a = {10, 73, 2, -5, 42};
    int[] b = {11, 74, 3, -4, 43};

    ArrayCopier.rcopy(a, b);

    assertEquals(43, a[0]);
    assertEquals(-4, a[1]);
    assertEquals( 3, a[2]);
    assertEquals(74, a[3]);
    assertEquals(11, a[4]);
  }

  @Test
  void test_rcopy_when_a_size_is_bigger_than_b() throws Exception {
    int[] a = {10, 73, 2, -5, 42};
    int[] b = {11, 74, 3, -4};

    ArrayCopier.rcopy(a, b);

    assertEquals(-4, a[0]);
    assertEquals( 3, a[1]);
    assertEquals(74, a[2]);
    assertEquals(11, a[3]);
    assertEquals(42, a[4]);
  }

  @Test
  void test_rcopy_when_a_size_is_smaller_than_b() throws Exception {
    int[] a = {10, 73, 2, -5};
    int[] b = {11, 74, 3, -4, 43};

    ArrayCopier.rcopy(a, b);

    assertEquals(43, a[0]);
    assertEquals(-4, a[1]);
    assertEquals( 3, a[2]);
    assertEquals(74, a[3]);
  }

}