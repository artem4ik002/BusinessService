package ru.netology.stats;

public class StatsService {
    public int sumSales(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }
        return sum;
    }

    public int averageSales(long[] sales) {
        double average = 0;
        if (sales.length > 0) {
            double sum = 0;
            for (long sale : sales) {
                sum += sale;
            }
            average = sum / sales.length;
        }
        return (int) average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int BelowAverageSale(long[] sales) {
        int count = 0;
        int averageSum = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSum) {
                count++;
            }
        }
        return count;
    }

    public int AboveAverageSales(long[] sales) {
        int count = 0;
        int averageSum = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSum) {
                count++;
            }
        }
        return count;
    }
}