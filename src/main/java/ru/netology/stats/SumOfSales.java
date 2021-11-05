package ru.netology.stats;

public class SumOfSales {
    public long sumOfSales(long[] sale) {
        long sum = 0;
        for (long ver : sale){
            sum = sum + ver;
        }
        return sum;
    }
}
