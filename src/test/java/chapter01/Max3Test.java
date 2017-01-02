package chapter01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class Max3Test {

  @Test
  @DisplayName("with assertAll")
  public void test_with_assertAll() throws Exception {
    assertAll("max3",
      () -> assertThat(Max3.max(3, 2, 1)).isEqualTo(3),
      () -> assertThat(Max3.max(3, 2, 2)).isEqualTo(3),
      () -> assertThat(Max3.max(3, 1, 2)).isEqualTo(3),
      () -> assertThat(Max3.max(3, 2, 3)).isEqualTo(3),
      () -> assertThat(Max3.max(2, 1, 3)).isEqualTo(3),
      () -> assertThat(Max3.max(3, 3, 2)).isEqualTo(3),
      () -> assertThat(Max3.max(3, 3, 3)).isEqualTo(3),
      () -> assertThat(Max3.max(2, 2, 3)).isEqualTo(3),
      () -> assertThat(Max3.max(2, 3, 1)).isEqualTo(3),
      () -> assertThat(Max3.max(2, 3, 2)).isEqualTo(3),
      () -> assertThat(Max3.max(1, 3, 2)).isEqualTo(3),
      () -> assertThat(Max3.max(2, 3, 3)).isEqualTo(3),
      () -> assertThat(Max3.max(1, 2, 3)).isEqualTo(3)
    );
  }

  @TestFactory
  @DisplayName("with TestFactory")
  Collection<DynamicTest> test_with_TestFactory() throws Exception {
    return Arrays.asList(
      dynamicTest("3 2 1", () -> assertThat(Max3.max(3, 2, 1)).isEqualTo(3)),
      dynamicTest("3 2 2", () -> assertThat(Max3.max(3, 2, 2)).isEqualTo(3)),
      dynamicTest("3 1 2", () -> assertThat(Max3.max(3, 1, 2)).isEqualTo(3)),
      dynamicTest("3 2 3", () -> assertThat(Max3.max(3, 2, 3)).isEqualTo(3)),
      dynamicTest("2 1 3", () -> assertThat(Max3.max(2, 1, 3)).isEqualTo(3)),
      dynamicTest("3 3 2", () -> assertThat(Max3.max(3, 3, 2)).isEqualTo(3)),
      dynamicTest("3 3 3", () -> assertThat(Max3.max(3, 3, 3)).isEqualTo(3)),
      dynamicTest("2 2 3", () -> assertThat(Max3.max(2, 2, 3)).isEqualTo(3)),
      dynamicTest("2 3 1", () -> assertThat(Max3.max(2, 3, 1)).isEqualTo(3)),
      dynamicTest("2 3 2", () -> assertThat(Max3.max(2, 3, 2)).isEqualTo(3)),
      dynamicTest("1 3 2", () -> assertThat(Max3.max(1, 3, 2)).isEqualTo(3)),
      dynamicTest("2 3 3", () -> assertThat(Max3.max(2, 3, 3)).isEqualTo(3)),
      dynamicTest("1 2 3", () -> assertThat(Max3.max(1, 2, 3)).isEqualTo(3))
    );
  }

}