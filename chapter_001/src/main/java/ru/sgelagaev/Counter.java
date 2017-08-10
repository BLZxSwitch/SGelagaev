package ru.sgelagaev;

/**
 * Класс сложения четных чисел в диапазоне.
 */
public class Counter {

    /**
     * Метод сложения четных чисел в диапазоне.
     * @param start - начало диапазона
     * @param finish - конец диапазона
     * @return - результат сложения
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
