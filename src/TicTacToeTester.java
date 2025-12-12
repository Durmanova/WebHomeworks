/***
 * Класс для тестирования класса TicTacToe (игры "крестики-нолики")
 * Класс отображает игровое поле, запрашивает у пользователя координаты следующей отметки
 * меняет игроков после каждого хода и объявляет победителя
 */

import java.util.Scanner;

public class TicTacToeTester {
    public static void main(String[] args) {
        TicTacToe newGame = new TicTacToe();
        Scanner in = new Scanner(System.in);
        printField(newGame);
        do {
            System.out.println("Ход игрока " + newGame.getCurrentPlayer());
            System.out.println("Введите координаты игрового поля (i,j): ");
            newGame.setMark(in.nextInt(), in.nextInt());
            printField(newGame);
        }
        while (!newGame.makeMove());
        System.out.println("Победитель - игрок " + newGame.getCurrentPlayer());
    }

    public static void printField(TicTacToe game) {
        for (int i = 0; i < game.getPlayField().length; i++) {
            for (int j = 0; j < game.getPlayField()[i].length; j++) {
                System.out.print(" " + game.getPlayField()[i][j]);
            }
            System.out.println();
        }
    }
}
