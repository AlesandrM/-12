package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    //Сумма всех продаж

    @Test
    void shouldSalesCalculation() {
        StatsService service = new StatsService();

        int[] theSumOfAllSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.salesCalculation(theSumOfAllSales);

        assertEquals(expected, actual);


    }

    //Средняя сумма продаж в месяц

    @Test
    void shouldAverageSalesPerMonth() {
        StatsService service = new StatsService();

        int[] averageSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;


        int actual = service.avgSales(averageSales);

        assertEquals(expected, actual);


    }

    //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)

    @Test
    void maxSalePerMonth() {
        StatsService service = new StatsService();

        int[] averageSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;


        int actual = service.monthWithMax(averageSales);

        assertEquals(expected, actual);
    }

    @Test
    void minSalePerMonth() {
        StatsService service = new StatsService();

        int[] averageSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;


        int actual = service.monthWithMin(averageSales);

        assertEquals(expected, actual);
    }

    @Test
    void monthsOnSaleWereBelowAverage() {
        StatsService service = new StatsService();

        int[] averageSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 0;


        int actual = service.moreThanAverage(averageSales);

        assertEquals(expected, actual);
    }

    @Test
    void numberOfMonthsInWhichSalesWereAboveAverage() {
        StatsService service = new StatsService();

        int[] averageSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 12;


        int actual = service.lessThanAverage(averageSales);

        assertEquals(expected, actual);
    }
}
