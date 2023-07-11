package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long sumSales = 0;
        for (long sale : sales) {
            sumSales += sale;
        }

        return sumSales;
    }

    public long middleSumSales(long[] sales) {
        long sumSales = sumSales(sales);
        long middleSales = sumSales / 12;

        return middleSales;
    }

    public int maxMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long minMonth(long[] sales) {
        long minMonth = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] < sales[(int) minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int monthAboveMiddle(long[] sales) {
        int aboveMiddle = 0;
        for (long sale : sales) {
            if (sale > middleSumSales(sales)) {
                aboveMiddle++;
            }
        }
        return aboveMiddle;

    }

    public int monthBelowMiddle(long[] sales) {
        int belowMiddle = 0;
        for (long sale : sales) {
            if (sale < middleSumSales(sales)) {
                belowMiddle++;
            }
        }
        return belowMiddle;

    }

}


