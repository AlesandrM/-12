package ru.netology.stats;

public class StatsService {

    //Сумма всех продаж

    public int salesCalculation(int[] sales) {
        int sumSales = 0;
        for (int sale : sales) {
            sumSales += sale;
        }

        return sumSales;

    }

    //Средняя сумма продаж в месяц

    public int sum(int[] sales) {
        int result = 0;
        for (int sale : sales) {
            result += sale;
        }
        return result;
    }

    public int avgSales(int[] sales) {

        int sum = sum(sales);
        return sum(sales) / sales.length;


    }

    //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)

    public int monthWithMax(int[] sales) {
        int max = sales[0];
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }

        int countMonth = 0;
        int monthWithMax = 0;
        for (int sale : sales) {
            //увеличить счетчик месяцев на 1
            countMonth++;
            if (sale == max) {
                monthWithMax = countMonth;
            }

        }
        return monthWithMax;

    }

    //Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)

    public int monthWithMin(int[] sales) {
        int min = sales[0];
        for (int sale : sales) {
            if (sale > min) {
                min = sale;
            }
        }

        int countMonth = 0;
        int monthWithMin = 0;
        for (int sale : sales) {
            //уменьшить счетчик месяцев на 1
            countMonth++;
            if (sale == min) {
                monthWithMin = countMonth;
            }

        }
        return monthWithMin;

    }

    //Кол-во месяцев, в которых продажи были ниже среднего

    private int avg(int[] sales) {
        int result = 0;
        for (int sale : sales) {
            result += sale;
        }
        return result;
    }

    public int moreThanAverage(int[] sales) {
        int avg = avg(sales);
        int countMont = 0;

        for (int sale : sales) {
            if (sale > avg) {
                countMont++;
            }
        }
        return countMont;
    }

    //Кол-во месяцев, в которых продажи были выше среднего

    public int lessThanAverage(int[] sales) {
        int avg = avg(sales);
        int countMont = 0;

        for (int sale : sales) {
            if (sale < avg) {
                countMont++;
            }
        }
        return countMont;
    }
}
