package com.gmail.andreyzarazka.task1;

/**
 * Created by Andrew Zarazka.
 * C[n] - Regular Bracket sequence made from N opening brackets and N closing brackets.
 * C[n] = X, X - An arbitrary regular bracket sequence.
 * Let is X = (A)B, where A and B - Regular Bracket sequences.
 * The length of the sequence A is C[k] and B = C[n-1-k]
 * C[n] = C[k]C[n-k-1]
 */
public class CatalanNumbers {
    /**
     * Returns the number of regular bracket sequences (Catalan numbers)
     *
     * @param number Non-negative integer
     * @return sum - the number of correct bracket sequences
     */
    public int getCatalanNumber(int number) {
        final int MIN_NUMBER = 0;
        final int FIRST_NUMBER_OF_CATALANS_SERIES = 1;

        int sum = 0;
        // Return the first number from the number of Catalans, if the entered number is 0
        if (number == MIN_NUMBER) {
            return FIRST_NUMBER_OF_CATALANS_SERIES;
        }

        // Calculating a number from the Catalan series
        for (int i = 0; i < number; i++) {
            sum += getCatalanNumber(i) * getCatalanNumber((number - 1) - i);
        }
        return sum;
    }
}