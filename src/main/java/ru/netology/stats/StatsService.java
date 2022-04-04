package ru.netology.stats;

import org.jetbrains.annotations.NotNull;

public class StatsService<minMonth> {

    public long calcSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }
    public long findAverage(long[] sales) {
        return calcSum(sales) / sales.length;
    }
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }
    public int minLimitSales(long[] sales) {
        int month = 0;
        for (long sale : sales) {

            if (sale < findAverage(sales)) {
                month = month + 1;
            }
            month = month;
        }
        return month;
    }
    public int maxLimitSales(long[] sales) {
        int month = 0;
        for (long sale : sales) {

            if (sale > findAverage(sales)) {
                month = month + 1;
            }
            month = month;
        }
        return month;
    }
}
