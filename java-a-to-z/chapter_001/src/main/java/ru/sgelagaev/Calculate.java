package ru.sgelagaev;

/**
*Класс для вывода тройного сообщения на экран.
 *@author sgelagaev
 *@since 08.08.2017
 *@version 1
*/
public class Calculate {
    /**
    *Метод для вывода сообщения на экран.
     *@param value строка для вывода на экран
     *@return String value
    */
    /*public*/ String echo(String value) {
        return String.format("%s %s %s", value, value, value);
    }

    /**
    *Конструктор, для вывода сообщения на экран.
     *@param arg - arg
    */
    public static void main(String[] arg) {
        Calculate calc = new Calculate();
        System.out.println(calc.echo("lalala"));
    }
}