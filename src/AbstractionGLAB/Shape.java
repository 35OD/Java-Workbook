package AbstractionGLAB;

public abstract class Shape {
    protected String color;
    protected double height;
    protected double width;
    protected double base;

    public void setColor(String color) {
        this.color = color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    // the getArea() method is abstract which means all the subclasses of Shape must implement this method
    public abstract double getArea();

    public String toString() {
        return "Shape[color=" + color + "]";
    }

    public void displayShapeName() {
        System.out.println("I am a shape");
    }
}
