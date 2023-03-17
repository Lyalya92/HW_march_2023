package hw1.task2;

public class Lorry extends Car implements Moveable, Stopable {

    @Override
    void open() {
        System.out.println("Lorry is open");
    }

    @Override
    public void move() {
        System.out.println("Lorry is moving");
    }

    @Override
    public void stop() {
        System.out.println("Lorry is stopped");
    }
}
