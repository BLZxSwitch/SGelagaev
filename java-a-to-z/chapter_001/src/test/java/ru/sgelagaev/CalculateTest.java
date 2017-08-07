package ru.sgelagaev;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CalculateTest{
    @Test
    public void whenSetStopInEchoThenReturnThreeStops(){
        //assigne
        Calculate calc = new Calculate();
        String result = calc.echo("stop");
        assertThat(result, is("stop stop stop"));
    }

    @Test
    public void whenSetNullInEchoThenReturnTwoSpaces(){
        //assigne
        Calculate calc = new Calculate();
        String result = calc.echo(null);
        assertThat(result, is("null null null"));
    }
}