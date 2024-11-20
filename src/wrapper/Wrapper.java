package wrapper;

import java.io.PrintStream;

public class Wrapper {
    public Wrapper() {
    }

    public void useAutoboxAndUnbox() {
        Integer intObj = 10;
        Double doubleObj = (double) 20.5F;
        int intValue = intObj;
        double doubleValue = doubleObj;
        int parseInt = Integer.parseInt("100");
        double parseDouble = Double.parseDouble("50.5");
        System.out.println("Autoboxing: " + intObj + ", " + doubleObj);
        PrintStream var10000 = System.out;
        String var10001 = String.valueOf(intObj.getClass());
        var10000.println("Autoboxing: " + var10001 + ", " + String.valueOf(doubleObj.getClass()));
        System.out.println("Unboxing: " + intValue + ", " + doubleValue);
        System.out.println("Parsed Values: " + parseInt + ", " + parseDouble);
    }

    public void useValueOf() {
        Integer intObj = 100;
        Integer obj = 100;
        System.out.println(intObj);
        System.out.println(intObj.getClass());
        Double doubleObj = 777.14;
        System.out.println(doubleObj);
        System.out.println(doubleObj.getClass());
    }

    public void useCharacterWrapper() {
        char ch = 'A';
        Character charObj = ch;
        char charPriminitive = charObj;
        System.out.println(ch);
        System.out.println(charObj.getClass());
        System.out.println("Priminitive char: " + charPriminitive);
    }
}
