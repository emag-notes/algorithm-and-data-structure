package chapter01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Min3Test {

  private final List<Integer> ELEMENTS = Arrays.asList(1, 2, 3);

  @BeforeEach
  void init() {
    Collections.shuffle(ELEMENTS);
  }

  @Test
  public void test() throws Exception {
    assertThat(Min3.min(ELEMENTS.get(0), ELEMENTS.get(1), ELEMENTS.get(2))).isEqualTo(1);
  }

}