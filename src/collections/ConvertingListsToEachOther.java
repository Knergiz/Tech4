package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ConvertingListsToEachOther {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);

        System.out.println("The ArrayList is = " + numbers);

        // converting ArrayList to a LinkedList
        LinkedList<Integer> numbers2 = new LinkedList<>(numbers);
        System.out.println("The LinkedList is = " + numbers2);

        //converting LinkedList to an ArrayList
        ArrayList<Integer> numbers3 = new ArrayList<>(numbers2);

        //  V    V  completely unrelated     V
        Vector<String> names = new Vector<>();










    }
}
