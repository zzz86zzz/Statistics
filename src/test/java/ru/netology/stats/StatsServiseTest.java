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
    void AverageSum() {
        StatsServise servise = new StatsServise();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = servise.AverageSum(purchases);
        assertEquals(15, actual);

    }
    @Test
    void MaxMonthSales() {
        StatsServise servise = new StatsServise();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = servise.MaxMonthSales(purchases);
        assertEquals(8, actual);

    }
    @Test
    void MinMonthSales() {
        StatsServise servise = new StatsServise();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = servise.MinMonthSales(purchases);
        assertEquals(9, actual);

    }
    @Test
    void MonthBelowAverage() {
        StatsServise servise = new StatsServise();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = servise.MonthBelowAverage(purchases);
        assertEquals(5, actual);

    }
    @Test
    void MonthAboveAverage() {
        StatsServise servise = new StatsServise();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = servise.MonthAboveAverage(purchases);
        assertEquals(5, actual);

    }
}