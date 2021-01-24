package ru.netology.stats;

public class StatsServise {
    public int calculateSum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public int averageSum(int[] purchases) {
        int months = 12;
        int sum = 0;
        int average = 0;
        for (int purchase : purchases) {
            sum += purchase;
            average = sum / months;
        }
        return average;
    }
    public int maxMonthSales(int[] purchases) {
        int month = 0;
        int counter = 0;
        int max = purchases[0];
        for (int purchase : purchases) {
            counter++;
            if (max <= purchase){
                max = purchase;
                month = counter;
            }
        }
        return month;
    }
    public int minMonthSales(int[] purchases) {
        int month = 0;
        int counter = 0;
        int min = purchases[0];
        for (int purchase : purchases) {
            counter++;
            if (min >= purchase){
                min = purchase;
                month = counter;
            }
        }
        return month;
    }
    public int monthBelowAverage ( int[] purchases){
        int mean = 0;
        int average = averageSum(purchases);
        for (int purchase : purchases) {
            if (average > purchase){
                mean++;
            }

        }
        return mean;

    }
    public int monthAboveAverage ( int[] purchases){
        int mean = 0;
        int average = averageSum(purchases);
        for (int purchase : purchases) {
            if (average < purchase){
                mean++;
            }

        }
        return mean;

    }
}
