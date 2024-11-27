package objectOProgram;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //class   //object      //memory     //constructor
        Auto obj1 = new Auto();
        //  obj1.setBrand("Mustang");
        //  obj1.setSpeed(150);

        //   System.out.println(obj1.getBrand());
        //   System.out.println(obj1.getSpeed());

        //class   //object      //memory     //constructor
        //  Auto       obj2           = new     Auto("Jeep", 100);

//       System.out.println(obj2.toString());
//       obj2.accelerate();
//
//       obj2.setSpeed(200);
//       obj2.accelerate();

        // int hold = obj1.addNumbers(7, 10);
        // System.out.println(hold);
        // obj1.accelerate();


        //invoking overloaded  methods
        Auto auto = new Auto("Ford", 175);
        auto.accelerate();
        auto.accelerate(50);
    }
}