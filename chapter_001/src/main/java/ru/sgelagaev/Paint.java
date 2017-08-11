package ru.sgelagaev;

/**
 * Клас для рисования пирамиды.
 */
public class Paint {

    /**
     * Метод для рисования пирамиды.
     * @param h - высота
     * @return - пирамида в псевдографике
     */
    public String piramid(int h) {
        int width = h + h - 1;
        int from = width / 2 + 1, to = width / 2 + 1;
        StringBuilder piramid = new StringBuilder();

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= width; j++) {
                if ((j < from) | (j > to)) {
                    piramid.append(" ");
                } else {
                    piramid.append("^");
                }
            }
            from--;
            to++;
            if (i != h) {
                piramid.append(System.getProperty("line.separator"));
            }
        }
        return piramid.toString();
    }
}
