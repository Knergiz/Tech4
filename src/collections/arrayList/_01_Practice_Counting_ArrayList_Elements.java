package collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class _01_Practice_Counting_ArrayList_Elements {
    public static void main(String[] args) {

        System.out.println("- - - - - Task 1 - - - - -\n");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(13);
        numbers.add(8);
        numbers.add(9);
        numbers.add(15);
        System.out.println(numbers);

        System.out.println("\n- - - - - Task 2 - - - - -\n");
        int count = 0;
        for (int num : numbers){
            if (num % 2 != 0){
                count += 1;
            }
        }
        System.out.println("Odds = " + count);

        System.out.println("\n- - - - - Task 3 - - - - -\n");
        List<String> colors = new ArrayList<>();
        colors.add("Purple");
        colors.add("Yellow");
        colors.add("blue");
        colors.add("red");
        colors.add("Brown");
        colors.add("Black");
        colors.add("White");
        System.out.println(colors);

        System.out.println("\n- - - - - Task 4 - - - - -\n");
        int UppercaseAmount = 0;
        for (String letter : colors){
            if (letter.charAt(0) >= 65 && letter.charAt(0) <= 90 ){
                UppercaseAmount += 1;
            }
        }
        System.out.println(UppercaseAmount);

        System.out.println("\n- - - - - Task 5 - - - - -\n");














    }
}
