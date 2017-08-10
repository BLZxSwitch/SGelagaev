package ru.sgelagaev;

/**
 * Класс для нахождения максимума двух числе.
 */
public class Max {

    /**
     * Метод для нахождения максимуму двух чисел.
     * @param first - первое число
     * @param second - второе число
     * @return максимальное из двух чисел
     */
    public int max(int first, int second) {
        return first >= second ? first : second;
    }
}
