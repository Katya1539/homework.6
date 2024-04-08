package ru.netology.services;

public class Calculation {
    public int calculate(int income, int expenses, int threshold) {

        int count = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = money / 3 - expenses;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}