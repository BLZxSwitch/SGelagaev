package ru.sgelagaev;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс для тестирования рисования пирамиды.
 */
public class PaintTest {

    /**
     * Тест для рисования пирамиды высотой 2.
      */
    @Test
    public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
        Paint paint = new Paint();
        String result = paint.piramid(2);
        String expected = String.format(" ^ %s^^^", System.getProperty("line.separator"));
        assertThat(result, is(expected));
    }

    /**
     * Тест для рисования пирамиды высотой 3.
     */
    @Test
    public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
        Paint paint = new Paint();
        String result = paint.piramid(3);
        String separator = System.getProperty("line.separator");
        String expected = String.format("  ^  %s ^^^ %s^^^^^", separator, separator);
        assertThat(result, is(expected));
    }

    /**
     * Тест для рисования пирамиды высотой 4.
     */
    @Test
    public void whenPiramidWithHeightFourThenStringWithFourRows() {
        Paint paint = new Paint();
        String result = paint.piramid(4);
        String separator = System.getProperty("line.separator");
        String expected = String.format("   ^   %s  ^^^  %s ^^^^^ %s^^^^^^^", separator, separator, separator);
        assertThat(result, is(expected));
    }

    /**
     * Тест для рисования пирамиды высотой 5.
     */
    @Test
    public void whenPiramidWithHeightFiveThenStringWithFiveRows() {
        Paint paint = new Paint();
        String result = paint.piramid(5);
        String separator = System.getProperty("line.separator");
        String expected = String.format("    ^    %s   ^^^   %s  ^^^^^  %s ^^^^^^^ %s^^^^^^^^^", separator, separator, separator, separator);
        assertThat(result, is(expected));
    }
}