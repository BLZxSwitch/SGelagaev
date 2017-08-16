package ru.sgelagaev;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс для тестирования вхождения подстроки в строку.
 */
public class SubStringTest {

    /**
     * Метод для тестирования вхождения подстроки в строку.
     */
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        SubString subString = new SubString();
        boolean result = subString.contains("Привет, как дела?", "ивет");
        boolean expected = true;
        assertThat(result, is(expected));
    }
}
