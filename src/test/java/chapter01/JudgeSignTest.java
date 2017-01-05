package chapter01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JudgeSignTest {

  @Test
  public void test() throws Exception {
    assertThat(JudgeSign.judge(1)).isEqualTo(Sign.POSITIVE);
    assertThat(JudgeSign.judge(-1)).isEqualTo(Sign.NEGATIVE);
    assertThat(JudgeSign.judge(0)).isEqualTo(Sign.ZERO);
  }

}