package polymorphAndInterfacePA;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser kidU = new KidUser();
        kidU.registerAccount(10);
        kidU.registerAccount(18);
        kidU.requestBook("Kids");
        kidU.requestBook("Fiction");
        System.out.println("---------------------------------------");
        AdultUser adultU = new AdultUser();
        adultU.registerAccount(5);
        adultU.registerAccount(23);
        adultU.requestBook("Kids");
        adultU.requestBook("Fiction");
    }
}
