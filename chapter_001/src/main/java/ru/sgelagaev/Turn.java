package ru.sgelagaev;

/**
 * Класс для разворота элементов массива.
 */
public class Turn {
    /**
     * Метод для разворота элементов массива.
     * @param array - массив
     * @return - результат
     */
    public int[] back(int[] array) {
        int count = array.length / 2;
        int temp;
        for (int i = 0; i < count; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
