/**
 * Класс, представляющий микроволновую печь, имеющую 4 кнопки:
 * */
public class Microwave {
    /**Поле времени готовки*/
    private int time;
    /**Поле уровня мощности*/
    private int level;

    /***
     * Конструктор - создание класса с заданными временем и уровнем
     * @param time - время готовки
     * @param level - уровень мощности
     */
    public Microwave(int time, int level) {
        if (time>=0) {
            this.time = time;
        }
        else {
            this.time = 0;
            System.out.println("Время готовки не может быть отрицательным");
        }
        if ((level==1)||(level==2))
        {
            this.level = level;
        }
        else {
            this.level = 1;
            System.out.println("Уровень мощности должен быть 1 или 2");
        }
    }

    /***
     * Конструктор - создание класса с пустыми параметрами
     */
    public Microwave(){
        time = 0;
        level = 1;
    }

    /***
     * Метод увеличения времени готовки на 30 секнуд
     */
    public void increaseTime(){
        int secondsIncreased = 30;
        time+=secondsIncreased;
        System.out.println("Время увеличено на 30 секнуд");
    }

    /***
     * Метод изменения уровня мощности
     */
    public void powerSwitch(){
        if (level ==1){
            level = 2;
        }
        else {
            level = 1;
        }
        System.out.println("Уровень мощности изменен на "+level);

    }

    /***
     * Метод сброса времени готовки
     */
    public void reset(){
        time = 0;
        System.out.println("Сброс времени готовки");
    }

    /***
     * Метод вывода сообщения о готовке
     */
    public void start(){
        System.out.println("Готовка займет "+time+" секунд на уровне "+level);
    }
}
