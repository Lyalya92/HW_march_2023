package hw1.task2;

public abstract class Car {
    private String name;
    private Engine engine;
    private String color;

    abstract void open();

    protected void start() {
        System.out.println("Car is starting");
    }

    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
