package com.example;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void test1() {
        // Setup
        int weightRemaining = 30;
        int index = 0;
        int stuffInKnapsackIndex = 0;
        int[] expectedStuffInKnapsack = new int[25];
        expectedStuffInKnapsack[0] = 5;
        expectedStuffInKnapsack[1] = 7;
        expectedStuffInKnapsack[2] = 2;
        expectedStuffInKnapsack[3] = 9;
        expectedStuffInKnapsack[4] = 3;
        expectedStuffInKnapsack[5] = 2;
        expectedStuffInKnapsack[6] = 1;
        knapsack test = new knapsack();

        // Execute
        int[] actual = test.knapsackCreator(weightRemaining, index, stuffInKnapsackIndex);

        // Assert
        assertArrayEquals(actual, expectedStuffInKnapsack);
    }
}
