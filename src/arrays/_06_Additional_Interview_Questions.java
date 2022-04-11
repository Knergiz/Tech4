package arrays;

import java.util.Arrays;

public class _06_Additional_Interview_Questions {
    public static void main(String[] args) {

        //task1 - easy method
        int[] numbers = {5, 3, 0, -5};
        Arrays.sort(numbers);
        System.out.println(numbers.length-1);

        //task1 - other method
        int max = numbers[0];
        for (int number : numbers){
            max = Math.max(max, number);
        }









    }
}
