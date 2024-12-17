package interfacesGLAB;

public class MyRunner {
    public static void main(String[] args) {
        Circle c1 = new Circle(1, 2, 2);
        System.out.println("Area of circle " + c1.getArea());
        System.out.println("Coordinates are " + c1.getCoordinate());

        c1.moveDown();
        System.out.println("After move down, Coordinates are " + c1.getCoordinate());

        c1.moveRight();
        System.out.println("After move right, coordinates are " + c1.getCoordinate());

        c1.moveUp();
        System.out.println("After move up, coordinates are " + c1.getCoordinate());

        c1.moveLeft();
        System.out.println("After move left, coordinates are " + c1.getCoordinate());

        System.out.println("--------Test Polymorphism-----------");
        Moveable c2 = new Circle(5, 10, 200); // upcasting
        c2.moveUp();
        System.out.println("After move up, coordinates are " + c2.getCoordinate());

        c2.moveLeft();
        System.out.println("After move left, coordinates are " + c2.getCoordinate());

        System.out.println("---------Practice-------------");

        Moveable c3 = new Triangle(2, 5, 10, 15);

        System.out.println("Triangle area: " + ((Triangle) c3).getArea());
        c3.moveUp();
        System.out.println("After move up, coordinates are " + c3.getCoordinate());
    }
}
