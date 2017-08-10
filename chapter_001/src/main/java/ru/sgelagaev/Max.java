package ru.sgelagaev;

/**
 * Класс для нахождения максимума двух числе.
 */
public class Max {

    /**
     * Метод для нахождения максимуму двух чисел.
     * @param first - первое число
     * @param second - второе число
     */
    public int max(int first, int second) {
        return first>=second? first: second;
    }
}
