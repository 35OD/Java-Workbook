package inheritanceGL;

public class TestPeople {
    public static void main(String[] args) {
        Person aPerson = new Person("Fred");
        Boy jimmy = new Boy();
        Girl betty = new Girl("Betty");

// boy b = new person(); // throw error
        // girl g = new person(); // throw error

        System.out.println(aPerson);
        System.out.println(aPerson.talk());
        System.out.println(aPerson.walk());
        System.out.println();

        System.out.println(jimmy);
        System.out.println(jimmy.talk());
        System.out.println(jimmy.walk());
        System.out.println();

        System.out.println(betty);
        System.out.println(betty.talk());
        System.out.println(betty.walk());
        System.out.println();


        System.out.println((Person) jimmy);
        System.out.println(((Person) jimmy).talk());
        System.out.println(((Person) jimmy).walk());
        System.out.println();

        System.out.println((Person) betty);
        System.out.println(((Person) betty).talk());
        System.out.println(((Person) betty).walk());
        System.out.println();

        System.out.println(Person.lifeSpan());
        System.out.println(Boy.lifeSpan());
        System.out.println(Girl.lifeSpan());

        System.out.println(((Boy) aPerson).talk());
    }
}