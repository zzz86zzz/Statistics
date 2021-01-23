package ru.netology.stats;

public class StatsServise {
    public int calculateSum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public int AverageSum(int[] purchases) {
        int months = 12;
        int sum = 0;
        int average = 0;
        for (int purchase : purchases) {
            sum += purchase;
            average = sum / months;
        }
        return average;
    }
    public int MaxMonthSales(int[] purchases) {
        int month = 0;
        int Counter = 0;
        int max = purchases[0];
        for (int purchase : purchases) {
            Counter++;
            if (max <= purchase){
                max = purchase;
                month = Counter;
            }
        }
        return month;
    }
    public int MinMonthSales(int[] purchases) {
        int month = 0;
        int Counter = 0;
        int min = purchases[0];
        for (int purchase : purchases) {
            Counter++;
            if (min >= purchase){
                min = purchase;
                month = Counter;
            }
        }
        return month;
    }
    public int MonthBelowAverage ( int[] purchases){
        int mean = 0;
        int average = AverageSum(purchases);
        for (int purchase : purchases) {
            if (average > purchase){
                mean++;
            }

        }
        return mean;

    }
    public int MonthAboveAverage ( int[] purchases){
        int mean = 0;
        int average = AverageSum(purchases);
        for (int purchase : purchases) {
            if (average < purchase){
                mean++;
            }

        }
        return mean;

    }
}