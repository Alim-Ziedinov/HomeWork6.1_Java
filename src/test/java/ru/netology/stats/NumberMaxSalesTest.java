package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberMaxSalesTest {

    @Test
    void max() {
        NumberMaxSales service = new NumberMaxSales();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.max(sales);
        long expected = 8;
        assertEquals(expected, actual);
    }
}