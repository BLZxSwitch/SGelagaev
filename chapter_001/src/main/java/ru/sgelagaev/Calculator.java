package ru.sgelagaev;

/**
 *Class Класс элементарного калькулятора.
 *@author sgelagaev
 *@since 10.08.2017
 *@version 1
 */
public class Calculator {

    /**
     * Поле для хранения результата.
     */
    private double result;

    /**
     * Метод для сложения двух вещественных числе.
     * @param first - первое слогаемое
     * @param second - второе слогаемое
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Метод для вычитания одного вещественного числа из другого.
     * @param first - уменьшаемое
     * @param second - вычитаемое
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Метод деления двух вещественных числе.
     * @param first - делимое
     * @param second - делитель
     */
    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Метод умножения двух вещественных чисел.
     * @param first - множимое
     * @param second - множитель
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    /**
     * Метод лоя возвращения результата вычислений.
     * @return - возвращаемое значение
     */
    public double getResult() {
        return this.result;
    }
}