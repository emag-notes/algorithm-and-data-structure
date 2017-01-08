package chapter01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SumProcessTest {

  @Test
  public void test_process() throws Exception {
    int input = 7;

    assertThat(SumProcess.process(input))
      .isEqualTo("1 + 2 + 3 + 4 + 5 + 6 + 7 = 28");
  }

}