package inheritanceOverridingObjGLAB;

public class Circle extends Shape {
    protected double radius;
    private final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getArea() {
        super.area = PI * Math.pow(this.radius, 2);
        return super.area;
    }

    @Override
    public void displayShapeName() {
        System.out.println("Drawing a cirlce of radius " + this.radius);
    }

    @Override
    public String toString() {
        return "Circle[ radius = " + radius + super.toString() + "]";
    }
}
