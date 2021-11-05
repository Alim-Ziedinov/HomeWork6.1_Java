package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberMinSalesTest {

    @Test
    void minSales() {
        NumberMinSales service = new NumberMinSales();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minSales(sales);
        long expected = 9;
        assertEquals(expected, actual);
    }
}