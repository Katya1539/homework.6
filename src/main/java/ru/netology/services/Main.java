package ru.netology.services;

public class Main {
    public static void main(String[] args) {

        Calculation service = new Calculation();

       // int income доход от работы
       // int expenses обязательные траты
      //  int threshold  остаток денег
        int count = service.calculate(100_000, 60_000, 150_000);
        System.out.println(count);

    }
}