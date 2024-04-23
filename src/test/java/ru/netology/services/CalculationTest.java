package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class CalculationTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/data.csv")
    public void test(int expected, int income, int expenses, int threshold) {
        Calculation service = new Calculation();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
