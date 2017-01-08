package chapter01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SumWhileTest {

  @Test
  public void test() throws Exception {
    int input = 5;

    assertThat(SumWhile.sum(input)).isEqualTo(15);
    assertThat(SumWhile.i.get()).isEqualTo(input + 1);
  }

}