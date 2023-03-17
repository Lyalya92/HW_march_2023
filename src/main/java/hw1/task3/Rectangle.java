package hw1.task3;

public class Rectangle extends Figure {
    private float width;
    private float height;

    public Rectangle(float x, float y, float width, float height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public float getPerimeter() {
        return 2*(width + height);
    }

    @Override
    public float getArea() {
        return width*height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle with width = " + this.width + ", height = " + this.height +
                " and central point with coordinates x0 = " + super.getX0() + ", y0 = " + super.getY0());
    }
}
