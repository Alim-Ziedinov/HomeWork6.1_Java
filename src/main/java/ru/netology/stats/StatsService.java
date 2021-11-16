package ru.netology.stats;

public class StatsService {

    public long sumOfSales(long[] sale) {
        long sum = 0;
        for (long ver : sale) {
            sum = sum + ver;
        }
        return sum;
    }

    public int max(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    public long averageAmounSales(long[] sale) {
        StatsService service = new StatsService();

        return service.sumOfSales(sale) / sale.length;
    }


    public long below(long[] sales) {
        StatsService service = new StatsService();

        long belowMonth = 0;
        for (long element : sales) {
            if (service.averageAmounSales(sales) < element) {
                belowMonth++;
            }
        }
        return belowMonth;
    }


    public long count(long[] sales) {
        StatsService service = new StatsService();

        long countMonth = 0;
        for (long element : sales) {
            if (service.averageAmounSales(sales) >= element) {
                countMonth++;
            }
        }
        return countMonth;
    }

}

