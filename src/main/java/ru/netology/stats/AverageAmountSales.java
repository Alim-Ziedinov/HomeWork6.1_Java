package ru.netology.stats;

public class AverageAmountSales {
    public long averageAmounSales(long[] sale) {
        SumOfSales ser = new SumOfSales();
        long amounSum = 0;
        for (long sum : sale) {
            amounSum = ser.sumOfSales(sale) / sale.length;
        }
        return amounSum;
    }
}
