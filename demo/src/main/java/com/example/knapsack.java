package com.example;

public class knapsack {
    int[] stuffInKnapsack = new int[25];
    int[] weights = { 5, 7, 2, 9, 21, 15, 9, 3, 2, 3, 7, 81, 100, 7, 3, 1, 90, 73, 26, 37, 53, 8 };

    public int[] knapsackCreator(int weightRemaining, int index, int stuffInKnapsackIndex) {

        if (index < weights.length & weightRemaining > 0) {
            if (weights[index] <= weightRemaining) {
                stuffInKnapsack[stuffInKnapsackIndex] = weights[index];
                weightRemaining = weightRemaining - (weights[index]);
                return (knapsackCreator(weightRemaining, (index + 1), (stuffInKnapsackIndex + 1)));
            } else {
                return (knapsackCreator(weightRemaining, (index + 1), stuffInKnapsackIndex));
            }
        } else {
            return (stuffInKnapsack);
        }
    }

    public void display(int[] stuffInKnapsack) {
        for (int index = 0; index < stuffInKnapsack.length; index++) {
            int displayMe = stuffInKnapsack[index];
            System.out.println(displayMe);
        }
    }
}
