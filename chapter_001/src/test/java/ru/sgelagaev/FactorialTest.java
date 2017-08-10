package ru.sgelagaev;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс для тестирования расчета факториала.
 */
public class FactorialTest {

    /**
     * Метод для тестирования расчета факториала числа 5.
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial factorial = new Factorial();
        double result = factorial.calc(5);
        double expected = 120;
        assertThat(result, is(expected));
    }

    /**
     * Метод для тестирования расчета факториала числа 0.
     */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial factorial = new Factorial();
        double result = factorial.calc(0);
        double expected = 1;
        assertThat(result, is(expected));
    }
}
