/**
 * Класс с единственным методом isLeapYear для определения является ли год високосным или нет
 */

public class Year {
    /**
     * Поле года для проверки
     */
    private int year;
    public Year(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public boolean isLeapYear() {
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }

}
