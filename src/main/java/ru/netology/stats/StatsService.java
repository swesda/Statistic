package ru.netology.stats;

public class StatsService {
    public int amount(int[] sales) {
        int amount = 0;
        for (int sale : sales) {
            amount += sale;
        }
        return amount;
    }

    public int minSales(int[] sales) {
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

    public int meanAmount(int[] sales) {
        if (sales.length == 0) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < sales.length; i++) {
            result += sales[i];
        }
        return result / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int meanMonthsUnderAmount(int[] sales) {
        int result = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < meanAmount(sales)) {
                result++;
            }
        }
        return result;
    }

    public int meanMonthsUpAmount(int[] sales) {
        int result = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > meanAmount(sales)) {
                result++;
            }
        }

        return result;
    }
}
