package polymorphAndInheritPA;

public class WaterMonster extends Monster {
    public WaterMonster(String name) {
        super(name);
    }

    public void attack() {
        System.out.println("Attack with water!");

    }
}
