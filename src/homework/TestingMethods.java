package homework;

import java.util.ArrayList;
import java.util.Arrays;

public class TestingMethods {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(35);
        nums.add(20);
        nums.add(35);
        nums.add(60);
        nums.add(70);
        nums.add(60);

        int[] arr1 = {3, 0, 0, 7, 5, 10};
        int[] arr2 = {6, 3, 2};
        int[] numbers = {10, -13, 8, 12, 15, -20};

        System.out.println(homework.Homework16.countWords("Java is fun and techGlobal too"));
        System.out.println(homework.Homework16.countA("Java is fun and techGlobal too"));
        System.out.println(homework.Homework16.removeDuplicateNumbers(nums));
        System.out.println(Arrays.toString(Homework16.add(arr1, arr2)));
        System.out.println(Homework16.findClosestTo10(numbers));

        if ("kerem" == "kerem"){
            System.out.println(true);
        } else System.out.println(false);

        System.out.println(Homework21.findSumOfNumbers("s1w2a3a4  "));







    }
}
