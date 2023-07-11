package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void CountSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void CountMiddleSum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMiddleSum = 180 / 12;
        long actualMiddleSum = service.middleSumSales(sales);
        Assertions.assertEquals(expectedMiddleSum, actualMiddleSum);
    }

    @Test
    public void CountmaxMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMaxMonth = 8;
        long actualMaxMonth = service.maxMonth(sales);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void CountminMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedminMonth = 9;
        long actualminMonth = service.minMonth(sales);
        Assertions.assertEquals(expectedminMonth, actualminMonth);
    }

    @Test
    public void CountMonthAboveMiddle() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonthAboveMiddle = 5;
        long actualMonthAboveMiddle = service.monthAboveMiddle(sales);
        Assertions.assertEquals(expectedMonthAboveMiddle, actualMonthAboveMiddle);
    }

    @Test
    public void CountMonthBelowMiddle() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonthBelowMiddle = 5;
        long actualMonthBelowMiddle = service.monthBelowMiddle(sales);
        Assertions.assertEquals(expectedMonthBelowMiddle, actualMonthBelowMiddle);
    }

}



