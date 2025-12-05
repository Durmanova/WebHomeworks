/***
 * Класс, представляющий студента и его оценки по тесту (общую сумму и среднее значение)
 */
public class Student {

    /**
     * Поле имени студента
     */
    private String name;
    /**
     * Поле общей суммы оценок
     */
    private double totalScore;
    /**
     * Поле количества пройденных тестов
     */
    private int numberOfQuizzes;

    /***
     * Конструктор - создание класса с заданным именем
     * @param name - имя студента
     */
    public Student(String name) {
        this.name = name;
        this.totalScore = 0;
        this.numberOfQuizzes = 0;
    }

    /***
     * Метод получения значения поля name
     * @return возвращает имя студента
     */
    public String getName() {
        return name;
    }

    /***
     * Метод добавления оценки за тест в общую сумму и увеличения общего количества пройденных тестов
     * @param score
     */
    public void addQuiz(int score) {
        if ((score >= 0) && (score <= 5)) {
            totalScore += score;
            numberOfQuizzes++;
            System.out.println("Оценка за тест добавлена");
        } else {
            System.out.println("Оценка неккоректна");
        }
    }

    /***
     * Метод получения значения поля totalScore
     * @return возвращает общую сумму оценок
     */
    public double getTotalScore() {
        return totalScore;
    }

    /***
     * Метод получения среднего балла за пройденные тесты
     * @return возвращает среднее значение по оценкам
     */
    public double getAverageScore() {
        if (numberOfQuizzes != 0) {
            return totalScore / numberOfQuizzes;
        } else {
            System.out.println("Количество тестов равно 0");
            return 0;
        }
    }
}
