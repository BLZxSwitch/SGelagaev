package ru.sgelagaev;

/**
 * Класс для сортировки массива.
 */
public class BubbleSort {

    /**
     * Метод для сортировки массива.
     * @param array - входной массив.
     * @return - отсортированный массив.
     */
    public int[] sort(int[] array) {
        boolean isSort = true;
        int temp;
        int decrement = 0;

        while (isSort) {
            isSort = false;
            for (int i = 0; i < array.length - 1 - decrement; i++) {
                if (array[i] > array[i + 1]) {
                    isSort = true;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            decrement++;
        }
        return array;
    }
}
