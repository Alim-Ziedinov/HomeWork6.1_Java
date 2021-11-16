package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void sumOfSales() {
        StatsService service = new StatsService();
        long actual = service.sumOfSales(sales);
        long expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void max() {
        StatsService service = new StatsService();
        long actual = service.max(sales);
        long expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void minSales() {
        StatsService service = new StatsService();
        long actual = service.minSales(sales);
        long expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void count() {
        StatsService service = new StatsService();
        long actual = service.count(sales);
        long expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    void below() {
        StatsService service = new StatsService();
        long actual = service.below(sales);
        long expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void averageAmounSales() {
        StatsService service = new StatsService();
        long actual = service.averageAmounSales(sales);
        long expected = 15;
        assertEquals(expected, actual);
    }

}