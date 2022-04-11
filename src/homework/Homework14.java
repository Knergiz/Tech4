package homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework14 {
    public static void main(String[] args) {

        //task1
        System.out.println("- - - - - Task1 - - - - -\n");

        int[] numbers = {-4, 0, 0, -7, 5, 10, 45, 45};
        boolean dupe = false;
        for (int j = 0; j< numbers.length; j++){
            for (int i = j + 1; i < numbers.length; i++){
                if (numbers[j] == numbers[i]){
                    System.out.println(numbers[j]);
                    dupe = true;
                    break;
                }
            }
            if (dupe) break;
        }
        if (!dupe) System.out.println("There is no duplicates");

        //task2
        System.out.println("\n- - - - - Task2 - - - - -\n");

        String[] words = {"Z", "abc", "Z", "123", "#" };
        boolean tOrF = false;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
             if (words[i].equals(words[j])){
                 System.out.println(words[i]);
                 tOrF = true;
                 break;
             }
            }
            if (tOrF) break;
        }
        if (!tOrF) System.out.println("There is no duplicates");

        //task3
        System.out.println("\n- - - - - Task3 - - - - -\n");

        boolean d = false;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]){
                    System.out.println(numbers[i]);
                    d = true;
                    break;
                }
            }
        }
        if (!d) System.out.println("There is no duplicates");

        //task4
        System.out.println("\n- - - - - Task4 - - - - -\n");

        String[] words2 = {"A", "foo", "12" , "Foo", "bar", "a", "a", "java"};
        boolean trueOrFalse = false;
        for (int i = 0; i < words2.length; i++) {
            for (int j = i + 1; j < words2.length; j++) {
                if (words2[i].equalsIgnoreCase(words2[j])){
                    System.out.println(words2[i]);
                    trueOrFalse = true;
                    break;
                }
            }
        }
        if (!trueOrFalse) System.out.println("There is no duplicates");

        //task5
        System.out.println("\n- - - - - Task5 - - - - -\n");
        String[] str = {"abc", "foo", "bar"};
        ArrayList<String> reverse = new ArrayList<>();
        for (int i = str.length - 1; i >= 0; i--) {
            reverse.add(str[i]);
        }
        System.out.println(reverse);

        //task6
        System.out.println("\n- - - - - Task6 - - - - -\n");
        String string = "Java is fun";
        String[] opposite = string.split(" ");
        Arrays.toString(opposite);
        for (int i = 0; i < opposite.length; i++){
            for (int j = opposite[i].length() - 1; j >= 0; j--) {
                System.out.print(opposite[i].charAt(j));
            }
            System.out.print(" ");
        }

















    }
}
