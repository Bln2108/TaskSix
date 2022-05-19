package ru.netology.stats;

public class StatsService {
    public int amountTotal(int[] sales) {
        int total = 0;
        for (int sale : sales) {
            total += sale;
        }
        return total;
    }

    public int amountTotalAverage(int[] sales) {
        int total = 0;
        for (int sale : sales) {
            total += sale;
        }
        return total / 12;
    }


    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }


    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int amountTotalAverageMin(int[] sales) {
        int total = 0;
        for (int sale : sales) {
            total += sale;
        }
        int totalAv = total / 12;
        int i = 0;
        for (int sale : sales) {
            if (sale < totalAv) {
                i++;
            }
        }
        return i;
    }

    public int amountTotalAverageMax (int[] sales) {
        int total = 0;
        for (int sale : sales) {
            total += sale;
        }
        int totalAv = total / 12;
        int i = 0;
        for (int sale : sales) {
            if (sale > totalAv) {
                i++;
            }
        }
        return i;
    }

}
