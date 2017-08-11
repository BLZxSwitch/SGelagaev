package ru.sgelagaev;

/**
 * Класс для вращения массива на 90 градусов по часовой стрелке.
 */
public class RotateArray {

    /**
     * Метод для вразения массива на 90 градусов по часовой стрелке.
     * @param array - массив
     * @return - повернутый массив
     */

    public int[][] rotate(int[][] array) {
        int temp;
        int sideSize = array.length - 1;

        for (int i = 0; i <= (sideSize + 1) / 2 - 1; i++) {
            for (int j = i; j <= sideSize - 1 - i; j++) {
                temp = array[i][j];
                array[i][j] = array[sideSize - j][i];
                array[sideSize - j][i] = array[sideSize - i][sideSize - j];
                array[sideSize - i][sideSize - j] = array[j][sideSize - i];
                array[j][sideSize - i] = temp;
            }
        }
        return array;
    }
}
