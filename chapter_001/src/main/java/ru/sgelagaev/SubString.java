package ru.sgelagaev;

/**
 * Класс для определения вхождения подстроки в строку.
 */
public class SubString {

    /**
     * Метод для определения вхождения подстроки в строку.
     * @param origin - исходная строка
     * @param sub - строка поиска
     * @return - результат поиска
     */
    boolean contains(String origin, String sub) {
        boolean isSubFound = false;
        for (int i = 0; (i <= origin.length() - sub.length() & !isSubFound); i++) {
            if (origin.charAt(i) == sub.charAt(0)) {
                for (int j = 1; j <= sub.length() - 1; j++) {
                    isSubFound = origin.charAt(i + j) == sub.charAt(j);
                }
            }
        }
        return isSubFound;
    }
}
