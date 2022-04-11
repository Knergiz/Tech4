package arrays;

import java.util.Arrays;

public class _05_Practice_Searching_In_Array {
    public static void main(String[] args) {

        //task1
        String[] objects = {"Remote", "Mickey Mouse", "Mickey Mouse", "Keyboard", "iPad"};

        boolean tOrF = false;
        for (int i = 0; i < objects.length; i++){
            if (objects[i].equals("board")){
                tOrF = true;
                break;
            }
        }
        System.out.println(tOrF);

        //task2

        Arrays.sort(objects);

        System.out.println(Arrays.binarySearch(objects, "iPad") >= 0); //true

        //task4
        int[] numbers = {5, -2, 0, -7, 0, 5, 8, 45, 53};
        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers, 5) >= 0);
        System.out.println(Arrays.binarySearch(numbers, 0) >= 0);
        System.out.println(Arrays.binarySearch(numbers, 45) >= 0);
        System.out.println(Arrays.binarySearch(numbers, 3) >= 0);
        System.out.println(Arrays.binarySearch(numbers, -7) >= 0);




    }
}
