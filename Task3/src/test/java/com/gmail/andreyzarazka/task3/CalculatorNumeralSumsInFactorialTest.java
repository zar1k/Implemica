package com.gmail.andreyzarazka.task3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Andrew Zarazka.
 */
public class CalculatorNumeralSumsInFactorialTest {
    CalculatorNumeralSumsInFactorial number;
    Map<Integer, Integer> mapNumberSumNumbersFactorials = new HashMap<>();

    @Before
    public void init() {
        number = new CalculatorNumeralSumsInFactorial();
        mapNumberSumNumbersFactorials.put(0, 1);
        mapNumberSumNumbersFactorials.put(1, 1);
        mapNumberSumNumbersFactorials.put(2, 2);
        mapNumberSumNumbersFactorials.put(3, 6);
        mapNumberSumNumbersFactorials.put(4, 6);
        mapNumberSumNumbersFactorials.put(5, 3);
        mapNumberSumNumbersFactorials.put(6, 9);
        mapNumberSumNumbersFactorials.put(7, 9);
        mapNumberSumNumbersFactorials.put(8, 9);
        mapNumberSumNumbersFactorials.put(9, 27);
        mapNumberSumNumbersFactorials.put(10, 27);
        mapNumberSumNumbersFactorials.put(100, 648);
    }

    @After
    public void destroy() {
        number = null;
        mapNumberSumNumbersFactorials.clear();
    }

    @Test
    public void whenPassCorrectValues() throws Exception {
        for (Map.Entry entry : mapNumberSumNumbersFactorials.entrySet()) {
            Integer num = (Integer) entry.getKey();
            Integer sumDigitsFactorial = (Integer) entry.getValue();
            assertThat(sumDigitsFactorial, is(number.getSumDigitsFactorial(num)));
        }
    }
}