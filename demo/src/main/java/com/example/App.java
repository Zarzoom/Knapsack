package com.example;

/**
 * Hello world!
 */
public class App 
{
    public static void main( String[] args )
    {
        knapsack test= new knapsack();
        int[] stuff=test.knapsackCreator(30, 0,0);
        test.display(stuff);
    }
}
