package chapter01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AdditionTableTest {

  @Test
  public void test() throws Exception {
    String expected =
      "   |  1  2  3  4  5  6  7  8  9\n" +
      "---+---------------------------\n" +
      " 1 |  2  3  4  5  6  7  8  9 10\n" +
      " 2 |  3  4  5  6  7  8  9 10 11\n" +
      " 3 |  4  5  6  7  8  9 10 11 12\n" +
      " 4 |  5  6  7  8  9 10 11 12 13\n" +
      " 5 |  6  7  8  9 10 11 12 13 14\n" +
      " 6 |  7  8  9 10 11 12 13 14 15\n" +
      " 7 |  8  9 10 11 12 13 14 15 16\n" +
      " 8 |  9 10 11 12 13 14 15 16 17\n" +
      " 9 | 10 11 12 13 14 15 16 17 18\n";

    assertThat(AdditionTable.get()).isEqualTo(expected);
  }

}