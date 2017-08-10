package ru.sgelagaev;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс для тестирования суммы четных числе в диапазоне.
 */
public class CounterTest {

    /**
     * Метод для тестирования суммы четных числе в диапазоне.
     */
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter counter = new Counter();
        double result = counter.add(1, 10);
        double expected = 30;
        assertThat(result, is(expected));
    }
}
