package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageAmountSalesTest {

    @Test
    void averageAmounSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        AverageAmountSales service = new AverageAmountSales();
        long actual = service.averageAmounSales(sales);
        long expected = 15;
        assertEquals(expected, actual);
    }
}