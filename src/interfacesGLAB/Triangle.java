package interfacesGLAB;

public class Triangle extends Shape implements Moveable {
    private int x, y;

    public Triangle(int x, int y, double base, double height) {
        this.x = x;
        this.y = y;
        this.base = base;
        this.height = height;

    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        y++;
    }

    @Override
    public String getCoordinate() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
//    Create two classes: Rectangle and Triangle. Extend both classes from the Shape class, and give an implementation of the Movable interface.

}
