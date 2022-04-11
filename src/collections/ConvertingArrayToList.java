package collections;

import java.util.*;

public class ConvertingArrayToList {
    public static void main(String[] args) {

        //one way to convert an array to an arraylist or a linkedlist
        String[] countries = {"USA", "Brasilia", "Argentina", "France", "Belgium", "Germany", "Portugal"};
        List<String> countries1 = new ArrayList<>(Arrays.asList(countries));
        List<String> countries2 = new LinkedList<>(Arrays.asList(countries));

        System.out.println(countries1);
        System.out.println(countries2);

        System.out.println("\n-----------------------------------\n");

        //another way
        List<String> countries3 = new ArrayList<>();
        List<String> countries4 = new LinkedList<>();

        Collections.addAll(countries3, countries); // adding all array elements to the list collections
        Collections.addAll(countries4, countries); // ^     ^      ^     ^     ^       ^      ^      ^

        System.out.println(countries3);
        System.out.println(countries4);

        //3rd way

        int[] numbers = {1, 2, 3, 4, 5};

        List<Integer> numbersList = new ArrayList<>();

        for (int i : numbers){
            numbersList.add(i);
        }












    }
}
