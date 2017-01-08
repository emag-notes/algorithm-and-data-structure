package chapter01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SpyramidTest {

  @Test
  public void test() throws Exception {
    String expected =
      "   *\n" +
      "  ***\n" +
      " *****\n" +
      "*******\n";

    assertThat(Spyramid.get(4)).isEqualTo(expected);
  }

}