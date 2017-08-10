package ru.sgelagaev;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 *Class Класс тестирования элементарного калькулятора.
 *@author sgelagaev
 *@since 10.08.2017
 *@version 1
 */
public class CalculatorTest {

    /**Тест метода add.
     * Попытка сложения "1" и "2".
     * Ожидаемый результат "3"
     */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 2D);
        double result = calc.getResult();
        double expected = 3D;
        assertThat(result, is(expected));
    }

    /**Тест метода subtract.
     * Попытка вычитания "1" из "1".
     * Ожидаемый результат "0"
     */
    @Test
    public void whenSubtractOneMinusOneThenZero() {
        Calculator calc = new Calculator();
        calc.subtract(1D, 1D);
        double result = calc.getResult();
        double expected = 0D;
        assertThat(result, is(expected));
    }

    /**Тест метода div.
     * Попытка деления "9" на "3".
     * Ожидаемый результат "3"
     */
    @Test
    public void whenDivNineDivThreeThenThree() {
        Calculator calc = new Calculator();
        calc.div(9D, 3D);
        double result = calc.getResult();
        double expected = 3D;
        assertThat(result, is(expected));
    }

    /**Тест метода multiple.
     * Попытка умножения "2" на "2".
     * Ожидаемый результат "4"
     */
    @Test
    public void whenMultipleTwoMulTwoThenFour() {
        Calculator calc = new Calculator();
        calc.multiple(2D, 2D);
        double result = calc.getResult();
        double expected = 4D;
        assertThat(result, is(expected));
    }
}
