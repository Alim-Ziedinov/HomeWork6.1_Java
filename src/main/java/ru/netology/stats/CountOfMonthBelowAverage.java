package ru.netology.stats;


public class CountOfMonthBelowAverage {
    public long below(long[] sales) {
        AverageAmountSales service = new AverageAmountSales();
        long belowMonth = 0;
        for (long element : sales) {
            if (service.averageAmounSales(sales) < element) {
                belowMonth++;
            }
        }
        return belowMonth;
    }
}


