package ru.sgelagaev;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Class ����� ��� ������������ �������� ������ �� �����.
 *@author sgelagaev
 *@since 08.08.2017
 *@version 1
 */
public class CalculateTest {

    /**���� ������ echo.
     */
    @Test
    public void whenSetStopInEchoThenReturnThreeStops() {
        //assigne
        Calculate calc = new Calculate();
        String result = calc.echo("stop");
        assertThat(result, is("stop stop stop"));
    }

    /**���� ������ echo.
     */
    @Test
    public void whenSetNullInEchoThenReturnTwoSpaces() {
        //assigne
        Calculate calc = new Calculate();
        String result = calc.echo(null);
        assertThat(result, is("null null null"));
    }
}