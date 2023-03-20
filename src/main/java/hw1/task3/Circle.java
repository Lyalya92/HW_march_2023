package hw1.task3;

public class Circle extends Figure implements Drawable {
    private float radius;

    public Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public float getPerimeter() {
        return 2 * 3.1415f * radius;
    }

    @Override
    public float getArea() {
        return 3.1415f * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle with radius = " + this.radius +
                " and central point with coordinates x0 = " + super.getX0() + ", y0 = " + super.getY0());
    }

}
