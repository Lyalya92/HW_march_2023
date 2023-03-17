package hw1.task2;

public class Task2Demo {

    public static void main(String[] args) {
        LightWeightCar car1 = new LightWeightCar();
        car1.open();
        car1.start();
        car1.move();

        Lorry car2 = new Lorry();
        car2.open();
        car2.start();
        car2.move();
        car2.stop();
    }
}
