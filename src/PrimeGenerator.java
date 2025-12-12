/***
 * Класс для генерации простых чисел с двумя методами - isPrime и nextPrime
 */
public class PrimeGenerator {
    /***
     * Поле для текущего рассматриваемого числа
     */
    private int currentNumber;

    /**
     * Конструктор создания класса, с заданным изначальным числом равным 1
     */
    public PrimeGenerator() {
        this.currentNumber = 1;
    }

    /**
     * Метод дял проверки является ли число простым (делится только на 1 и на себя)
     *
     * @param numberToCheck - текущее число для проверки
     * @return - возвращает true, если число простое, false, если составное
     */
    public boolean isPrime(int numberToCheck) {
        for (int i = 2; i <= Math.sqrt(numberToCheck); i++) {
            if ((numberToCheck % i == 0)) {
                return false;
            }
        }
        return true;
    }

    /***
     * Метод для получения следующего простого числа после текущего простого числа
     * @return - возвращает простое число
     */
    public int nextPrime() {
        currentNumber++;
        while (!isPrime(currentNumber)) {
            currentNumber++;
        }
        return currentNumber;
    }
}
