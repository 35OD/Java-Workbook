package interfacesGLAB;

public interface Moveable {
    // an interface defines a list of public abstract methods to be implemented by the subclasses

    // all methods in an interface are public and abstract by default
    void moveUp();

    void moveDown();

    void moveLeft();

    void moveRight();

    String getCoordinate();
}
