package chapter01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SumForTest {

  @Test
  public void test() throws Exception {
    int input = 5;

    assertThat(SumFor.sum(input)).isEqualTo(15);
  }

}