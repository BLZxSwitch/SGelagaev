package ru.sgelagaev;

/**
 * Класс для рисования шахматной доски псевдографикой.
 */
public class Board {

    /**
     * Метод для сования шахматной доски псевдографикой.
     * @param width - ширина
     * @param height - высота
     * @return - результат
     */
    public String paint(int width, int height) {
        StringBuilder console = new StringBuilder();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        console.append("x");
                    } else {
                        console.append(" ");
                    }
                } else {
                    if (j % 2 != 0) {
                        console.append("x");
                    } else {
                        console.append(" ");
                    }
                }

                if (j == width) {
                    console.append(System.getProperty("line.separator"));
                }
            }
        }
        return console.toString();
    }
}