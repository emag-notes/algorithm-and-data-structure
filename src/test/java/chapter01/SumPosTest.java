package chapter01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class SumPosTest {

  @Test
  public void test() throws Exception {
    assertThat(SumPos.sum(5)).isEqualTo(15);
  }

  @Test
  public void zero_is_invalid() throws Exception {
    assertThatThrownBy(() -> SumPos.sum(0))
      .isInstanceOf(IllegalArgumentException.class)
      .hasMessage("arg must be positive number");
  }

  @Test
  public void negative_is_invalid() throws Exception {
    assertThatThrownBy(() -> SumPos.sum(-1))
      .isInstanceOf(IllegalArgumentException.class)
      .hasMessage("arg must be positive number");
  }

}