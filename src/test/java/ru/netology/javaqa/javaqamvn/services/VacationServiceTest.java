package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.javaqa.javamavn.services.VacationService;

public class VacationServiceTest {
    @Test
    public void shouldCalculateVacationMonthsExample1() {
        VacationService service = new VacationService();

        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expected = 4;

        int actual = service.calculateVacationMonths(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
   public void shouldCalculateVacationMonthsExample2() {
        VacationService service = new VacationService();

        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expected = 3;

        int actual = service.calculateVacationMonths(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}