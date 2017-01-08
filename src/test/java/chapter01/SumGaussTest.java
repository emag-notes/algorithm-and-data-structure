package chapter01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SumGaussTest {

  @Test
  public void test_process() throws Exception {
    int input = 10;

    assertThat(SumGauss.sum(input)).isEqualTo(55);
  }


}