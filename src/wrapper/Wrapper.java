package wrapper;

import java.io.PrintStream;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.StringJoiner;

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

    public void useMoreStringMethods() {
        String str = "  Hello World  ";
        System.out.println("Character at index 4: " + str.charAt(4));
        //extracts a substring at the start including the first number and excluding the last one
        System.out.println("Substring (2, 8): " + str.substring(2, 8));

        System.out.println("To lower case: " + str.toLowerCase());
        System.out.println("To uppercase: " + str.toUpperCase());

        // adds to the end of the string
        System.out.println("Concatenation: " + str.concat("!!!"));

        // removes leading and trailing white space characters aka tab and spaces
        System.out.println("Trim: " + str.trim());

        // removes leading and trailing white space including unicode spaces
        System.out.println("Strip (JDK 11): " + str.strip());

        // checks if the string matches the specified regular expression
        System.out.println(("Matches regex '.*World.*': " + str.matches(".*World.*")));

        // replaces all occurrences of the specified character with another character
        System.out.println("Replace 'o' with 'X': " + str.replace("o", "X"));

        // replaces all substrings matching thr given regular expression with the given replacement
        System.out.println("Replace all white spaces with '_': " + str.replaceAll("\\s", "_"));

        // splits the string into an array of substrings based on the specified delimiter
        String str2 = "Java Python\tC++ Ruby";
        String[] parts = str2.split("\\s+"); // split using white space as a delimiter
        System.out.println("Split result: ");
        // enhances for loop - can use with arrays and no index
        for (String part : parts) {
            System.out.println(part); // outputs each word
        }
    }

    public void useScanner() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First  name: ");
        String firstName = input.nextLine();

        System.out.println("Enter Last name: ");
        String lastName = input.nextLine();

        System.out.println("Welcome " + firstName + " " + lastName);

    }

    public void convertStringToNumber() {
        // String to primitive using parsing methods
        String intString = "42";
        System.out.println("Result: " + intString + 10);
        //  System.out.println("int result: " + num);
        int intValue = Integer.parseInt(intString);
        System.out.println("Primitive int: " + intValue);
        int num = intValue + 10;
        System.out.println("int result: " + num);

        String doubleString = "3.14";
        double doubleValue = Double.parseDouble(doubleString);
        System.out.println("Primitive double: " + doubleValue);

        // String to wrapper object using valueOf methods
        Float intWrapper = Float.valueOf(intString);
        System.out.println("Integer wrapper: " + intWrapper);
        System.out.println("Integer wrapper: " + intWrapper.getClass());
    }

    public void convertNumberToString() {
        // Convert primitive numbers to String
        int intValue = 42;
        String intString = Integer.toString(intValue);
        System.out.println("String from int: " + intString);
        System.out.println("Integer wrapper: " + intString.getClass());

        // Convert wrapper objects to String
        Integer intWrapper = 123;
        System.out.println("Integer wrapper: " + intWrapper.getClass());

        String intWrapperString = intWrapper.toString();
        System.out.println("String from Integer wrapper: " + intWrapperString);
        System.out.println("Integer wrapper: " + intWrapperString.getClass());
    }

    public void useStringBuffer() {
        StringBuffer sb1 = new StringBuffer();  //capacity 16 default
        System.out.println("Default capacity:  " + sb1.capacity());

        StringBuffer sb2 = new StringBuffer(10);
        System.out.println("Default capacity:  " + sb2.capacity());

        StringBuffer sb3 = new StringBuffer("Hello World");
        System.out.println("Default capacity:  " + sb3.capacity());

        //Append
        sb3.append(" and have a great day");
        System.out.println("After append: " + sb3);

        //Insert
        sb3.insert(23, "Beautiful ");
        System.out.println("After insert: " + sb3);

        //Replace
        sb3.replace(23, 32, "Amazing");
        System.out.println("After insert: " + sb3);

        //Reverse
        sb3.reverse();
        System.out.println("After insert: " + sb3);
        sb3.reverse();
        System.out.println("After insert: " + sb3);

        //Length
        System.out.println("Length: " + sb3.length());

        // Capacity
        System.out.println("Capacity: " + sb3.capacity());

        //Modifying and ensure capacity
        sb3.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb3.capacity());

    }

    public void useStringJoiner() {
        //Create StringJoiner using a delimiter
        StringJoiner joiner = new StringJoiner(",");
        //Adding elements
        joiner.add("Java");
        joiner.add("Python");
        joiner.add("C++");

        System.out.println("Joined String: " + joiner);

        // Using StringJoiner with a prefix and suffix
        StringJoiner fancyJoiner = new StringJoiner(",", "[[[[", "]");
        fancyJoiner.add("Java");
        fancyJoiner.add("Python");
        fancyJoiner.add("C++");

        System.out.println("Fancy Joined String: " + fancyJoiner);


    }

    public void useFormatingToConsole() {
        // System.out.format() Formats and directly prints to the console.
        System.out.format("System.out.format: Name: %s, Age: %d, Salary: %.2f%n", "Alice", 30, 150000.345);

        // Works the same as System.out.format, shorthand for formatted printing.
        System.out.printf("System.out.format: Name: %s, Age: %d, Salary: %.2f%n", "Bob", 35, 150000.345);

        //Returns a formatted string instead of printing directly.
        String formattedString = String.format("String.format: Name: %s, Age: %d, Salary: %.2f", "Charlie", 40, 60000.33);
        System.out.println(formattedString);

    }

    public void useMathClass() {

//        int a = 10, b = -20;
//        System.out.println(Math.abs(a)); // 10
//        System.out.println(Math.abs(b)); // 20
//        System.out.println(Math.max(a, b)); // 10
//        System.out.println(Math.min(a, b)); // -20
//
//        System.out.println(Math.exp(1));
//        System.out.println(Math.log(2.71));
//        System.out.println(Math.pow(2,3));
//        System.out.println(Math.sqrt(4));
//        System.out.println(Math.sqrt(10.5));

        double d = 83.67;
        System.out.println(Math.ceil(d));  // return double & rounded up to its nearest integer
        System.out.println(Math.floor(d)); // return double and rounded down to its nearest integer
        System.out.println(Math.rint(d)); // return double but find the closest integers for these double numbers
        //Math.round() It is used to round of the decimal numbers to the nearest value.
        System.out.println(Math.round(d));  // 84;
        double a = 1.878;
        System.out.println(Math.round(a));  // 2
        // value equals to 5 after decimal
        double b = 1.5;
        System.out.println(Math.round(b));  // 2
        // value less than 5 after decimal
        double c = 1.34;
        System.out.println(Math.round(c));  // 1

        //Math.random() method
        // generate integer number b/w 1 to 100
        int n1 = (int) (Math.random() * 100);
        int n2 = (int) (Math.random() * 100);

        // display generated integer numbers
        System.out.println(n1);
        System.out.println(n2);

    }


}
