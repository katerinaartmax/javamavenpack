package ru.netology.javaqa.javaqamvn.services;
public class VacationService {
    public int calculateVacationMonths(int income, int expenses, int threshold)
    {
        int vacationMonths = 0;
        int money = 0;

        for (int month = 1; month < 12; month++) {
            if (money >= threshold) {
                vacationMonths++;
                money = money - expenses;
                money = money / 3; // траты на отдых
            } else {
                money = money - expenses + income;

            }
        }

        return vacationMonths;
    }
}
