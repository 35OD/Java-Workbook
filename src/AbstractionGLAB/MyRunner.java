package AbstractionGLAB;

public class MyRunner {
    public static void main(String[] args) {
        Circle c = new Circle(100);
        System.out.println("Area of circle " + c.getArea());

        // Shape sObj = new Shape(); cant work as you cannot instantiate abstract classes

        System.out.println("-------------------------------");
        // this is fine because a circle is a shape by inheritance
        Shape shapeCircleObj = new Circle(100); // upcasting
        shapeCircleObj.displayShapeName();
        System.out.println("Area of circle " + shapeCircleObj.getArea());
        System.out.println(shapeCircleObj); // run circle's toString
        // using instanceof to validate it is an instance of circle
        System.out.println(shapeCircleObj instanceof Circle);

        System.out.println("------------------------------------");
        Shape shapeRectangleObj = new Rectangle("Red");
        shapeRectangleObj.displayShapeName();
        shapeRectangleObj.setHeight(2);
        shapeRectangleObj.setWidth(4);
        System.out.println("Area of rectangle is " + shapeRectangleObj.getArea());
        System.out.println(shapeRectangleObj);
        System.out.println(shapeRectangleObj instanceof Rectangle);

        System.out.println("--------------------------------------");
        Shape shapeTriangleObj = new Triangle("Blue");
        shapeTriangleObj.displayShapeName();
        shapeTriangleObj.setHeight(10);
        shapeTriangleObj.setBase(15);
        System.out.println("Are of triangle is " + shapeTriangleObj.getArea());
        System.out.println(shapeTriangleObj);
    }

}
