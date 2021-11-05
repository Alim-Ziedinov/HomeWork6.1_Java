package ru.netology.stats;

public class CountOfMonthAboveAverage {
    public long count(long[] sales) {
        AverageAmountSales service = new AverageAmountSales();
        long countMonth = 0;
        for (long element : sales) {
            if (service.averageAmounSales(sales) >= element) {
                countMonth++;
            }
        }
        return countMonth;
    }
}