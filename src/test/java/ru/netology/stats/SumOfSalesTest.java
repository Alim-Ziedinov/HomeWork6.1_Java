package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfSalesTest {

    @Test
    void sumOfSales() {
        SumOfSales service = new SumOfSales();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sumOfSales(sales);
        long expected = 180;
        assertEquals(expected, actual);
    }
}
