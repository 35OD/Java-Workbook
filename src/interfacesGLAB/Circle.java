package interfacesGLAB;

public class Circle extends Shape implements Moveable {
    protected double radius;
    private int x, y; // x and y coordinates of the point
    private final double PI = Math.PI;

    // constructs a MoveablePoint instance t the given x and y
    public Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, double height) {
        this.radius = radius;
        super.height = height;
    }

    @Override
    public double getArea() {
        double area = PI * Math.pow(this.radius, 2);
        return area;
    }

    @Override
    public void displayShapeName() {
        System.out.println("Drawing a circle of radius " + this.radius);
    }

    @Override
    public String toString() {
        return "Circle[ radius = " + radius + super.toString() + "]";
    }

    public String getCoordinate() {
        return "(" + x + "," + y + ")";
    }


    @Override
    public void moveUp() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }


}
