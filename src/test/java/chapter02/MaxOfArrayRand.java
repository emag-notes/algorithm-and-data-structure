package chapter02;

import org.junit.jupiter.api.Test;

import java.util.Random;

public class MaxOfArrayRand {

  @Test
  public void test() throws Exception {
    Random random = new Random();

    int number = random.nextInt(5) + 1;
    int[] heights = new int[number];

    for (int i = 0; i < number; i++) {
      heights[i] = random.nextInt(90) + 100;
      System.out.println(String.format("heights[%d]: %d", i, heights[i]));
    }
  }

}
