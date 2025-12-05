/**
 * Класс для проверки введенного пользователем года и вызова метода isLeapYear класса Year
 * для определения является ли число високосным или невисокосным
 */

public class YearTest {
    public static void main(String[] args) {
        Year leapYear = new Year(2004);
        Year regularYear = new Year(2005);
        System.out.println("Год "+leapYear.getYear()+" "+ (leapYear.isLeapYear() ? "високосный" : "невисокосный"));
        System.out.println("Год "+regularYear.getYear()+" "+ (regularYear.isLeapYear() ? "високосный" : "невисокосный"));
    }
}
