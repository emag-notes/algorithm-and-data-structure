package chapter01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class SubtractTest {

  @Test
  public void test() throws Exception {
    assertThat(Subtract.subtract(6, 8)).isEqualTo(2);
  }

  @Test
  public void arg_2_must_be_larger_than_arg_1() throws Exception {
    assertThatThrownBy(() -> Subtract.subtract(8, 6))
      .isInstanceOf(IllegalArgumentException.class)
      .hasMessage("arg 2 must be larger than arg 1");
  }

}