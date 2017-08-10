package ru.sgelagaev;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс для дестирования нахожедния максимума двух числе.
 */
public class MaxTest {
    /**
     * Метод для тестирования нахожедния максимума двух числе.
     */
    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }
    /**
     * Метод для тестирования нахожедния максимума двух числе, при их равенстве.
     */
    @Test
    public void whenFirstEquilSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 1);
        assertThat(result, is(1));
    }

    /**
     * Метод для тестирования нахожедния максимума трех числе.
     */
    @Test
    public void whenThirdIsMaxOfThree() {
        Max maxim = new Max();
        int result = maxim.max(1, 2, 3);
        assertThat(result, is(3));
    }
}
