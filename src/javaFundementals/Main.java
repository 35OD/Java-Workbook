package javaFundementals;

public class Main {
    public static void main(String[] args) {

        JavaBasics obj = new JavaBasics();

        obj.useVariables();
        obj.useLiterals();

        obj.setName("Bruh");
        String myName = obj.getName();
        System.out.println(myName);

        obj.useScanner();
    }
}
