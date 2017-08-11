package ru.sgelagaev;

import java.util.Arrays;

/**
 * Класс нахождения дублирующих записей в массиве строк.
 */
public class ArrayDuplicate {
    /**
     * Метод нахождения дублирующих записей в массиве строк.
     * @param array - массив строк
     * @return - результирующий массив
     */
    public String[] remove(String[] array) {
        int duplicateCount = 0;
        String temp;


        for (int i = 0; i <= array.length - 1 - duplicateCount; i++) {
            for (int j = i + 1; j <= array.length - 1 - duplicateCount; j++) {
                if (array[i].equals(array[j])) {
                    duplicateCount++;
                    temp = array[j];
                    array[j] = array[array.length  - duplicateCount];
                    array[array.length  - duplicateCount] = temp;
                }
            }
        }
        return Arrays.copyOf(array, array.length - duplicateCount);
    }
}
