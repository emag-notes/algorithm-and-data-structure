package chapter01;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

class SumOfTest {

  @TestFactory
  Collection<DynamicTest> test() throws Exception {
    return Arrays.asList(
      dynamicTest("3..5", () -> assertThat(SumOf.sum(3, 5)).isEqualTo(12)),
      dynamicTest("3..5", () -> assertThat(SumOf.sum(6, 4)).isEqualTo(15))
    );
  }

}