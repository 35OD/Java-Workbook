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
        //  Integer intObj = Integer.valueOf(100); is another way to do it
        System.out.println(intObj);
        System.out.println(intObj.getClass());
        Double doubleObj = 777.14;
        System.out.println(doubleObj);
        System.out.println(doubleObj.getClass());
    }

    public void useCharacterWrapper() {
        char ch = 'A';
        Character charObj = ch; //turning primitive into an object
        char charPrimitive = charObj; //turning object into primitive
        System.out.println(charObj);
        System.out.println(charObj.getClass());
        System.out.println("Primitive char: " + charPrimitive);

        //additional character methods
        char cha = '9';
        char letter = 'a';
        System.out.println("Is digit?: " + Character.isDigit(cha));
        System.out.println("Is letter?: " + Character.isLetter(letter));
        System.out.println("Uppercase: " + Character.toUpperCase(letter));
        System.out.println("Lowercase: " + Character.toLowerCase(letter));

        char chA = 'A';
        Character charObj1 = Character.valueOf(chA);
        System.out.println("Character object: " + charObj1);
        System.out.println(charObj1.getClass());

        String str = String.valueOf(chA);
        System.out.println("String rep: " + str);
        System.out.println(str.getClass());
    }

    //  \t tab- adds space between columns
    public void useEscapeSeq() {
        System.out.println("Name\tAge\tLocation");
        System.out.println("Vic\t21\tPA");
        System.out.println("Barb\t30\tOH");

        //  \b backspace- removes the character immediately before the escape sequence
        System.out.println("Hello\bWorld");

        //  \n new line- moves the next after the escape sequence to a new line
        System.out.println("Hello\nWorld");

        //  \r carriage return- moves the cursor to the beginning of the current line, overwriting the text already printed. The \r moves the cursor back to the beginning of the line, overwriting "Hello" with "World."
        System.out.println("Hello\rWorld");

        //  \f form feed- advances the text to the next page or section (commonly used in printers
        System.out.println("Hello\fWorld");

        // \' single quote- allows a single quote to appear in the text
        System.out.println("It\'s a great day");

        //  \" double quote- allows a double quote to appear in the text
        System.out.println("He said, \"Hello\"");

        //  \\ backslash- allows a backslash to appear in the text
        System.out.println("Path: C:\\Users\\Documents");
    }

    public void useStrings() {
        //create string objects using literals
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1 == s2); //comparison == compares memory location/reference, output will be true

        //creating string objects using new operator

        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s3 == s4); //output will be false because new operator creates new objects in memory
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
    }

    public void usePopularStringMethods() {
        String str = "Hello World";

        //finding string size
        System.out.println("Length: " + str.length());
        System.out.println("Empty?: " + str.isEmpty());
        System.out.println("Blank?: " + str.isBlank());

        //string comparison
        System.out.println("Equals: " + str.equals("Hello World"));
        System.out.println("Equals: " + str.equalsIgnoreCase("hello world"));

//           int compareTo(String another)
//         Compares strings lexicographically (dictionary order).
//                Returns: 0 if strings are equal.
//                A negative number if the current string is lexicographically smaller.
//         A positive number if it's larger.
//
        System.out.println("Equals: " + str.compareTo("Hello Worl"));

        System.out.println("Value Of: " + String.valueOf(123));
        System.out.println("Starts With: " + str.startsWith("Hello"));
        System.out.println("Ends With: " + str.endsWith("World"));

        //finding a character in a string
        System.out.println("Index of 'o: " + str.indexOf('o'));
        System.out.println("Last index of 'o: " + str.lastIndexOf('o'));
        System.out.println("Contains 'World': " + str.contains("World"));


    }
}
