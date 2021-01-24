package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiseTest {

    @Test
    void calculateSum() {
        StatsServise servise = new StatsServise();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = servise.calculateSum(purchases);
        assertEquals(180, actual);


    }

    @Test
    void averageSum() {
        StatsServise servise = new StatsServise();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = servise.averageSum(purchases);
        assertEquals(15, actual);

    }
    @Test
    void maxMonthSales() {
        StatsServise servise = new StatsServise();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = servise.maxMonthSales(purchases);
        assertEquals(8, actual);

    }
    @Test
    void minMonthSales() {
        StatsServise servise = new StatsServise();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = servise.minMonthSales(purchases);
        assertEquals(9, actual);

    }
    @Test
    void monthBelowAverage() {
        StatsServise servise = new StatsServise();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = servise.monthBelowAverage(purchases);
        assertEquals(5, actual);

    }
    @Test
    void monthAboveAverage() {
        StatsServise servise = new StatsServise();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = servise.monthAboveAverage(purchases);
        assertEquals(5, actual);

    }
}
