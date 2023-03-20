package hw1.task3;

public abstract class Figure implements Drawable {
    private float x0;
    private float y0;

    public abstract float getPerimeter();
    public abstract float getArea();

    public Figure(float x, float y) {
        this.x0 = x;
        this.y0 = y;
    }

    public float getX0() {
        return x0;
    }

    public float getY0() {
        return y0;
    }
}
