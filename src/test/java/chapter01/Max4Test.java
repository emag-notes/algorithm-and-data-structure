package chapter01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Max4Test {

  private final List<Integer> ELEMENTS = Arrays.asList(1, 2, 3, 4);

  @BeforeEach
  void init() {
    Collections.shuffle(ELEMENTS);
  }

  @Test
  void test() throws Exception {
    assertEquals(4, Max4.max(ELEMENTS.get(0), ELEMENTS.get(1), ELEMENTS.get(2), ELEMENTS.get(3)));
  }

}