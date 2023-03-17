package hw1.task3;

public class Task3Demo {
    public static void main(String[] args) {
        Rectangle square = new Square(0, 0, 5.0f);
        square.draw();
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println("Area: " + square.getArea());

        Rectangle rect = new Rectangle(1, 2, 3, 4);
        rect.draw();
        System.out.println("Perimeter: " + rect.getPerimeter());
        System.out.println("Area: " + rect.getArea());

        Figure circle = new Circle(0, 0, 1);
        circle.draw();
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());


    }
}
