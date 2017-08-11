package ru.sgelagaev;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс для тестирования нахождения дублирующих записей в массиве строк.
 */
public class ArrayDuplicateTest {

    /**
     * Тест для нахождения дублирующих записей в массиве строк.
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] arrayToCheck = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] result = arrayDuplicate.remove(arrayToCheck);
        String[] expected = {"Привет", "Мир", "Супер"};
        assertThat(result, is(expected));
    }
}