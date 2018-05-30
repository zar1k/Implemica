package com.gmail.andreyzarazka.task3;

import java.math.BigInteger;

/**
 * Created by Andrew Zarazka.
 */
public class CalculatorNumeralSumsInFactorial {
    /**
     * Method calculate calculate the sum of all factorial number's digits.
     *
     * @param num integer number
     * @return sum of all factorial number's digits
     */

    public int getSumDigitsFactorial(int num) {
        final int DEFAULT_SUM = 0;

        int sum = DEFAULT_SUM;
        BigInteger fact = BigInteger.ONE;

        // Calculate the factorial of number
        for (int i = 2; i <= num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        String number = String.valueOf(fact);

        // Calculate sum of all digits in the number
        for (int i = 0; i < number.length(); i++) {
            sum += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        return sum;
    }
}