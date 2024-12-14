package generic;

public class GenericMethod {

    public void createArray() {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"A", "B", "C"};

        printArray(intArray);
        printArray(stringArray);
    }

    // T is any type of object
    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }


}
