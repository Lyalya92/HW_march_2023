package hw1.task3;

public class Square extends Rectangle {
    private float width;

    public Square(float x, float y, float width) {
        super(x, y, width, width);
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Square with width = " + this.width +
                " and central point with coordinates x0 = " + super.getX0() + ", y0 = " + super.getY0());
    }
}
