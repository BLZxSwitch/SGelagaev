package ru.sgelagaev;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс теста вращения массива на 90 градусов по часовой стрелке.
 */
public class RotateArrayTest {

    /**
     * Тест вращения массива 2 на 2.
     */
    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        RotateArray rotateArray = new RotateArray();
        int[][] arrayToRotate = {{4, 1}, {5, 3}};
        int[][] result = rotateArray.rotate(arrayToRotate);
        int[][] expected = {{5, 4}, {3, 1}};
        assertThat(result, is(expected));
    }

    /**
     * Тест вращения массива 3 на 3.
     */
    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        RotateArray rotateArray = new RotateArray();
        int[][] arrayToRotate = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result = rotateArray.rotate(arrayToRotate);
        int[][] expected = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        assertThat(result, is(expected));
    }

    /**
     * Тест вращения массива 4 на 4.
     */
    @Test
    public void whenRotateFourRowFourColArrayThenRotatedArray() {
        RotateArray rotateArray = new RotateArray();
        int[][] arrayToRotate = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] result = rotateArray.rotate(arrayToRotate);
        int[][] expected = {{13, 9, 5, 1}, {14, 10, 6, 2}, {15, 11, 7, 3}, {16, 12, 8, 4}};
        assertThat(result, is(expected));
    }

    /**
     * Тест вразения массива 5 на 5.
     */
    @Test
    public void whenRotateFiveRowFiveColArrayThenRotatedArray() {
        RotateArray rotateArray = new RotateArray();
        int[][] arrayToRotate = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        int[][] result = rotateArray.rotate(arrayToRotate);
        int[][] expected = {{21, 16, 11, 6, 1}, {22, 17, 12, 7, 2}, {23, 18, 13, 8, 3}, {24, 19, 14, 9, 4}, {25, 20, 15, 10, 5}};
        assertThat(result, is(expected));
    }
}