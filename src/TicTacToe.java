/***
 * Класс, реализующий логику игры "крестики-нолики" (tic-tac-toe).
 */
public class TicTacToe {
    /**
     * Количество столбцов
     */
    final int COLUMN_NUMBER = 3;
    /**
     * Количество строк
     */
    final int ROW_NUMBER = 3;
    /**
     * Номер первого игрока (ставит "нолики" по заданию)
     */
    final int PLAYER_ONE = 1;
    /**
     * Номер второго игрока (ставит "крестики" по заданию)
     */
    final int PLAYER_TWO = 2;
    /**
     * Символ используемый первым игроком
     */
    final char CIRCLE = '0';
    /**
     * Символ используемый вторым игроком
     */
    final char CROSS = 'X';
    /**
     * Двумерная матрица представляющая игровое поле
     */
    private char[][] playField = new char[ROW_NUMBER][COLUMN_NUMBER];
    /***
     * Текущий игрок
     */
    private int currentPlayer;

    /***
     * Конструктор класса, устанавливает текущего игрока (по заданию - первого),
     * заполняет игровое поле символами '_'
     */
    public TicTacToe() {
        currentPlayer = PLAYER_ONE;
        for (int i = 0; i < ROW_NUMBER; i++) {
            for (int j = 0; j < COLUMN_NUMBER; j++) {
                playField[i][j] = '_';
            }
        }

    }

    /***
     * Метод, устанавливающий символ в указанную ячейку
     * @param i - индекс строки
     * @param j - индекс столбца
     */
    public void setMark(int i, int j) {
        if (currentPlayer == PLAYER_ONE) {
            playField[i][j] = CIRCLE;
        }
        if (currentPlayer == PLAYER_TWO) {
            playField[i][j] = CROSS;
        }
    }

    /**
     * Метод возвращающий текущее игровое поле
     *
     * @return массив, представляющий игровое поле
     */
    public char[][] getPlayField() {
        return playField;
    }

    /***
     * Метод для определения завершения игры и смены пользователя, если игра не закончена
     * @return true, если один из игроков победил, иначе false
     */
    public boolean makeMove() {
        boolean isWin = false;
        isWin = (currentPlayer == PLAYER_ONE) ? checkWin(CIRCLE) : checkWin(CROSS);
        if (isWin) {
            return true;
        } else {
            changePlayer();
            return false;
        }
    }

    /***
     * Метод смены игроков
     */
    public void changePlayer() {
        if (currentPlayer == PLAYER_ONE) {
            currentPlayer = PLAYER_TWO;
        } else if (currentPlayer == PLAYER_TWO) {
            currentPlayer = PLAYER_ONE;
        }
    }

    /***
     * Метод получения текущего пользователя
     * @return номер текущего пользователя
     */
    public int getCurrentPlayer() {
        return currentPlayer;
    }

    /***
     * Метод проверки игрового поля на наличие выигрышной комбинации символа игрока
     * @param element - символ игрока (0 или Х)
     * @return - true, если выигрышная комбинация была найдена, иначе false
     */
    public boolean checkWin(char element) {
        //Проверка диагоналей
        if (playField[1][1] == element) {
            if ((playField[0][0] == element) && (playField[2][2] == element) || (playField[0][2] == element) && (playField[2][0] == element)) {
                return true;
            }
        }
        for (int i = 0; i < ROW_NUMBER; i++) {
            //Проверка по строкам
            if ((playField[i][0] == element) && (playField[i][1] == element) && (playField[i][2] == element)) {
                return true;
            }
            for (int j = 0; j < COLUMN_NUMBER; j++) {
                //Проверка по столбцам
                if ((playField[0][j] == element) && (playField[1][j] == element) && (playField[2][j] == element)) {
                    return true;
                }
            }
        }
        return false;
    }
}
