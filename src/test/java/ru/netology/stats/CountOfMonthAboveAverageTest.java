package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountOfMonthAboveAverageTest {

    @Test
    void count() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        CountOfMonthAboveAverage service = new CountOfMonthAboveAverage();
        long actual = service.count(sales);
        long expected = 7;
        assertEquals(expected, actual);
    }
}