package ru.netology.stats;

public class Main {
    public static void main(String[] args) {


        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.amountTotalAverageMax(sales);
        int expected = 5;
        System.out.println(" ОР: " + actual + "  ФР: " + expected);


        //StatsService service = new StatsService();
        //int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //int actual = service.amountTotalAverageMin (sales);
        //int expected = 5;
        //System.out.println( " ОР: " + actual + "  ФР: " + expected);

        //StatsService service = new StatsService();
        //int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //int actual = service.minSales (sales);
        //int expected = 9;
        //System.out.println( " ОР: " + actual + "  ФР: " + expected);

        //StatsService service = new StatsService();
        //int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //int actual = service.maxSales (sales);
        //int expected = 8;
        //System.out.println( " ОР: " + actual + "  ФР: " + expected);

        //StatsService service = new StatsService();
        //int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //int actual = service.amountTotalAverage (sales);
        //int expected = 15;
        //System.out.println( " ОР: " + actual + "  ФР: " + expected);

    }
}
