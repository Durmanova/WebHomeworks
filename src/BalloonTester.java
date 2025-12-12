/**Класс для тестирования класса Balloon*/
public class BalloonTester {
    public static void main(String[] args) {
        Balloon redBalloon = new Balloon();
        redBalloon.inflate(50);
        System.out.println("Текущий объем красного воздушного шара "+redBalloon.getVolume());

        Balloon greenBalloon = new Balloon(10);
        greenBalloon.inflate(10);
        System.out.println("Текущий объем зеленого воздушного шара "+greenBalloon.getVolume());
    }
}
