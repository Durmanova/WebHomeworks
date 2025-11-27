/**
 * Класс для проверки введенного пользователем года и вызова метода isLeapYear класса Year
 * для определения является ли число високосным или невисокосным
 */

import java.util.Scanner;

public class YearTest {
    public static void main(String[] args) {
        Year checkYear = new Year();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        System.out.print(checkYear.isLeapYear(in.nextInt()));
    }
}
