package collections.linkedLists;

import java.util.LinkedList;
import java.util.function.DoubleToLongFunction;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {

        //linked list probides all the methods that arraylist provides and more.
        //linkedlist syntax :  LinkedList<String> names = new LinkedList<>();
        //                     List<String> names = new LinkedList<>();

        LinkedList<Double> numbers = new LinkedList<>();
        numbers.add(10.5);
        numbers.add(12.5);
        numbers.add(13.3);
        numbers.add(17.7);

        System.out.println(numbers);

        //looping linkedlist with forEach
        for (double d : numbers){
            System.out.println(d);
        }

        //easy methods for linkedlist
        System.out.println(numbers.get(0));
        System.out.println(numbers.getFirst()); // first element 10.5
        System.out.println(numbers.getLast()); // last element 17.7
        System.out.println(numbers.peek()); // getFirst() 10.5
        System.out.println(numbers.peekFirst()); // 10.5
        System.out.println(numbers.peekLast()); // 17.7

        System.out.println(numbers);

        System.out.println("\n-----------------------------------\n");
        System.out.println(numbers.poll()); // retrieves first element and removes it
        System.out.println(numbers.pollFirst()); // ^ same as above ^
        System.out.println(numbers.pollLast()); // ^ same as above but last element ^

        System.out.println("\n-----------------------------------\n");
        numbers.push(5.7); // pushes object to first index (0)
        numbers.push(8.9);
        System.out.println(numbers.pop()); // removes the object at first index (0)
        System.out.println(numbers);













    }
}
