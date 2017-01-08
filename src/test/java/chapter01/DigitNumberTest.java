package chapter01;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

class DigitNumberTest {

  @TestFactory
  Collection<DynamicTest> test() throws Exception {
    return Arrays.asList(
      dynamicTest("123", () -> assertThat(DigitNumber.check(123)).isEqualTo(3)),
      dynamicTest("1234", () -> assertThat(DigitNumber.check(1234)).isEqualTo(4))
    );
  }

}