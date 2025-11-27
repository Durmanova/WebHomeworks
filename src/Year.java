/**
 * Класс с единственным методом isLeapYear для определения является ли год високосным или нет
 */

public class Year {
    public String isLeapYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return "Год високосный";
        } else {
            return "Год невисокосный";
        }
    }
}
