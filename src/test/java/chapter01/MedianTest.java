package chapter01;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

class MedianTest {

  @TestFactory
  Collection<DynamicTest> test() throws Exception {
    return Arrays.asList(
      dynamicTest("3 2 1", () -> assertThat(Median.med3(3, 2, 1)).isEqualTo(2)),
      dynamicTest("3 2 2", () -> assertThat(Median.med3(3, 2, 2)).isEqualTo(2)),
      dynamicTest("3 1 2", () -> assertThat(Median.med3(3, 1, 2)).isEqualTo(2)),
      dynamicTest("3 2 3", () -> assertThat(Median.med3(3, 2, 3)).isEqualTo(3)),
      dynamicTest("2 1 3", () -> assertThat(Median.med3(2, 1, 3)).isEqualTo(2)),
      dynamicTest("3 3 2", () -> assertThat(Median.med3(3, 3, 2)).isEqualTo(3)),
      dynamicTest("3 3 3", () -> assertThat(Median.med3(3, 3, 3)).isEqualTo(3)),
      dynamicTest("2 2 3", () -> assertThat(Median.med3(2, 2, 3)).isEqualTo(2)),
      dynamicTest("2 3 1", () -> assertThat(Median.med3(2, 3, 1)).isEqualTo(2)),
      dynamicTest("2 3 2", () -> assertThat(Median.med3(2, 3, 2)).isEqualTo(2)),
      dynamicTest("1 3 2", () -> assertThat(Median.med3(1, 3, 2)).isEqualTo(2)),
      dynamicTest("2 3 3", () -> assertThat(Median.med3(2, 3, 3)).isEqualTo(3)),
      dynamicTest("1 2 3", () -> assertThat(Median.med3(1, 2, 3)).isEqualTo(2))
    );
  }

}