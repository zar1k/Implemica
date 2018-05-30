package com.gmail.andreyzarazka.task1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CatalanNumbersTest {
    private CatalanNumbers number;
    private int[] seriesOfNumbersCatalana;

    @Before
    public void init() {
        number = new CatalanNumbers();
        seriesOfNumbersCatalana = new int[]{1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, 16796};
    }

    @After
    public void destroy() {
        number = null;
        seriesOfNumbersCatalana = null;
    }

    @Test
    public void whenPassCorrectValues() throws Exception {
        for (int i = 0; i <= seriesOfNumbersCatalana.length - 1; i++) {
            assertThat(seriesOfNumbersCatalana[i], is(number.getCatalanNumber(i)));
        }
    }
}