package polymorphAndInheritPA;

public class FireMonster extends Monster {
    public FireMonster(String name) {
        super(name);
    }

    public void attack() {
        System.out.println("Attack with fire!");

    }
}
