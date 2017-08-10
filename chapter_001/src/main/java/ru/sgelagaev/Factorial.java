package ru.sgelagaev;

/**
 * Класс для расчета факториала.
 */
public class Factorial {
    /**
     * Метод для расчета факториала.
     * @param n - число для расчета факториала
     * @return - факториал
     */
    public int calc(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
