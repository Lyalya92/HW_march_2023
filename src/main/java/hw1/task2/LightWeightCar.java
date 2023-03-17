package hw1.task2;

public class LightWeightCar extends Car implements Moveable{
    @Override
    void open() {
        System.out.println("LightWeightCar is open");
    }

    @Override
    public void move() {
        System.out.println("LightWeightCar is moving");
    }
}
