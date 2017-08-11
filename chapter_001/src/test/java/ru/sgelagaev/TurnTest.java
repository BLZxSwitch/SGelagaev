package ru.sgelagaev;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс для тестирования развотора массива.
 */
public class TurnTest {

    /**
     * Тест для разворота массива из 4х элементов.
     */
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] arrayToTurn = {4, 1, 6, 2};
        int[] result = turn.back(arrayToTurn);
        int[] expected = {2, 6, 1, 4};
        assertThat(result, is(expected));
    }

    /**
     * Тест для разворота массива из 5ти элементов.
     */
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] arrayToTurn = {1, 2, 3, 4, 5};
        int[] result = turn.back(arrayToTurn);
        int[] expected = {5, 4, 3, 2, 1};
        assertThat(result, is(expected));
    }
}
