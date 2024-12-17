package polymorphAndInheritPA;

public class StoneMonster extends Monster {
    public StoneMonster(String name) {
        super(name);
    }

    public void attack() {
        System.out.println("Attack with stones!");

    }
}
