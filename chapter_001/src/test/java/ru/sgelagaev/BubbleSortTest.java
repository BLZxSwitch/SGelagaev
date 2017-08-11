package ru.sgelagaev;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс для тестирования сортировки массива.
 */
public class BubbleSortTest {

    /**
     * Метод для тестирования сортировки массива.
     */
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        //напишите здесь тест, проверяющий сортировку массива из 10 элементов методом пузырька, например {1, 5, 4, 2, 3, 1, 7, 8, 0, 5}.
        BubbleSort bubbleSort = new BubbleSort();
        int[] arrayToSort = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] result = bubbleSort.sort(arrayToSort);
        int[] expected = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(result, is(expected));
    }
}
