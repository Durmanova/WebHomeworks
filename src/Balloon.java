/**
 * Класс, представляющий воздушний шар, с возможностью увеличения радиуса шара и полчуения текущего объема шара
 */
public class Balloon {
    /**
     * Поле радиус
     */
    private double radius;

    /**
     * Конструктор - создание нового шара с нулевым радиусом
     */
    public Balloon() {
        radius = 0;
    }

    /**
     * Конструктор - создание нового шара с заданным радиусом
     *
     * @param radius
     */
    public Balloon(double radius) {
        this.radius = radius;
    }

    /**
     * Метод увеличения радиуса на определенное значение
     *
     * @param amount - значение, на которое будет увеличен радиус шара
     */
    public void inflate(double amount) {
        if (amount < 0) {
            System.out.println("Отрицательное значение! Радиус шара не увеличивается");
        } else {
            radius += amount;
        }
    }

    /**
     * Метод получения объема шара
     *
     * @return - возвращает текущий объем шара
     */
    public double getVolume() {
        double currValue = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return currValue;
    }
}