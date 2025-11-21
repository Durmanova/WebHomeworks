/**Класс тестирования класса Student*/
public class StudentTester {
    public static void main(String[] args) {
        Student student1 = new Student("Иван Иванов");
        student1.addQuiz(5);
        student1.addQuiz(3);
        student1.addQuiz(4);
        student1.addQuiz(5);
        System.out.println("Студент: "+student1.getName()+"\nОбщая оценка: "+student1.getTotalScore()+"\nСредняя оценка: "+student1.getAverageScore());
        System.out.println();
        Student student2 = new Student("Петр Петров");
        student2.addQuiz(3);
        student2.addQuiz(5);
        System.out.println("Студент: "+student2.getName()+"\nОбщая оценка: "+student2.getTotalScore()+"\nСредняя оценка: "+student2.getAverageScore());

    }
}
