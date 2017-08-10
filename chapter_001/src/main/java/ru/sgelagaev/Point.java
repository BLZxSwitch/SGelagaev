package ru.sgelagaev;

/**
 * Класс для создания точки и провеки вхождения точки в функцию.
 */
public class Point {
    /**
     * Поле для хранения координат х.
     */
    private int x;
    /**
     * Поле для хранения координат у.
     */
    private int y;

    /**
     * Конструктор точки.
     * @param x - ось Х
     * @param y - ось У
     */
    public  Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Гетер для оси Х.
     * @return - х
     */
    public int getX() {
        return this.x;
    }

    /**
     * Гетер для оси У.
     * @return - у
     */
    public int getY() {
        return this.y;
    }

    /**
     * Метод проверки вхождения точки в функцию.
     * @param a - a
     * @param b - b
     * @return - возвращает true при вхождении, иначе false
     */
    public boolean is(int a, int b) {
        return y == a * x + b ? true : false;
    }
}