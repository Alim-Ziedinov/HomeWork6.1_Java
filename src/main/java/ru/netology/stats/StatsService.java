package ru.netology.stats;

import java.time.Month;

public class StatsService {
    public static void main(String[] args) {
        NumberMinSales service = new NumberMinSales();
        NumberMaxSales service2 = new NumberMaxSales();
        SumOfSales service3 = new SumOfSales();
        AverageAmountSales service4 = new AverageAmountSales();
        CountOfMonthAboveAverage service5 = new CountOfMonthAboveAverage();
        CountOfMonthBelowAverage service6 = new CountOfMonthBelowAverage();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        String sum = String.format("%S %s;", "сумма всех продаж - ", service3.sumOfSales(sales));
        System.out.println(sum);

        int numberMaxSales = service2.max(sales);
        String monthName = String.format("%S %s (%s);", "Месяц с максимальной продажей: ", numberMaxSales, Month.of(numberMaxSales));
        System.out.println(monthName);

        int numberMinSale = service.minSales(sales);
        String MinSale = String.format("%S %s (%s);","месяц с минимальной продажей:",service.minSales(sales), Month.of(numberMinSale));
        System.out.println(MinSale);

        String countMonth = String.format("%S %s; ","количество месяцев, в которых продажи были выше среднего - ",service5.count(sales));
        System.out.println(countMonth);

        String belowMonth = String.format("%S %s;","количество месяцев, в которых продажи были ниже среднего - ",service6.below(sales));
        System.out.println(belowMonth);

        System.out.format("%S %s;", "Средние продажи в месяц - ", service4.averageAmounSales(sales));
    }
}