package collections.arrayList;

import primitives.Int;

import java.util.ArrayList;
import java.util.List;

public class CheckingIfListCointainsMultipleElements {
    public static void main(String[] args) {

        //task1
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(50);
        numbers.add(55);
        numbers.add(40);
        numbers.add(45);
        numbers.add(30);

        // if statement way
        if (numbers.contains(5)){
            System.out.println(true);
        }else System.out.println(false);

        //simpler way since its a boolean
        System.out.println(numbers.contains(5));

        //task2
        System.out.println(numbers.contains(20) && numbers.contains(30));

        //task3
        List<Integer> elementsToBeChecked = new ArrayList<>();
        elementsToBeChecked.add(30);
        elementsToBeChecked.add(35);
        elementsToBeChecked.add(40);
        elementsToBeChecked.add(45);
        elementsToBeChecked.add(50);

        //very easy way to check if multiple elements are in another element
        System.out.println(numbers.containsAll(elementsToBeChecked));





    }
}
