package linkedListProcessingGLAB;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        // linked list declaration
        LinkedList<String> linkedList = new LinkedList<String>();

        // add(String element) is used for adding the elements to the linked list
        linkedList.add("Item1");
        linkedList.add("Item5");
        linkedList.add("Item3");
        linkedList.add("Item6");
        linkedList.add("Item2");

        // display linked list content
        System.out.println("Linked List Content: " + linkedList);

        // add first and last element
        linkedList.addFirst("First Item");
        linkedList.addLast("Last Item");
        System.out.println("LinkedList content after addition: " + linkedList);

        // this is how to get and set values
        Object firstVar = linkedList.get(0);
        System.out.println("First element: " + firstVar);
        linkedList.set(0, "Changed first item");
        Object firstVar2 = linkedList.get(0);
        System.out.println("First element after update by set method: " + firstVar2);

        // remove first and last element
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("LinkedList after deleted of first and last element: " + linkedList);

        // add to a position and remove from a position
        linkedList.add(0, "Newly added item");
        linkedList.remove(2);
        System.out.println("Final content: " + linkedList);
    }
}
