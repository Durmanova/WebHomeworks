/***
 * Класс для вывода простых чисел до лимта, заданного пользователем
 */

import java.util.Scanner;

public class PrimePrinter {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        int numberLimit = in.nextInt();
        PrimeGenerator primeGenerator = new PrimeGenerator();
        int primeNumber = primeGenerator.nextPrime(); //Получение первого простого числа (будет всегда равно 2)
        while (primeNumber <= numberLimit) { //Вывод простых чисел до тех пор пока не будет достигнут введенный пользователем лимит
            System.out.println(primeNumber);
            primeNumber = primeGenerator.nextPrime();//Поиск следующего простого числа
        }
    }
}
