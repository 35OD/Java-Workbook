package polymorphAndInheritPA;

public class Monster {
    protected String name;

    public Monster(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println("I don't know how to attack!");
    }


}
