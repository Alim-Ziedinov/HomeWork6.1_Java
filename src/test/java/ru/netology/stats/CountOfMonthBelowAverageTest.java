package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountOfMonthBelowAverageTest {

    @Test
    void below() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        CountOfMonthBelowAverage service = new CountOfMonthBelowAverage();
        long actual = service.below(sales);
        long expected = 5;
        assertEquals(expected, actual);
    }
}