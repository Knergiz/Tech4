package whiteboard;

import java.util.Arrays;

public class SecondMin {
    public static int findSecondMin(int[] array){
     int min = Integer.MAX_VALUE;
     int secondMin = Integer.MAX_VALUE;

     for (int element : array){
         if (element < min){
             secondMin = min;
             min = element;
         }else if (element < secondMin && element > min){
             secondMin = element;
         }
     }
        return secondMin;
    }

    public static void main(String[] args) {
        int[] array = {-5, 4, 1,-5,  10, 2};
        System.out.println(findSecondMin(array));

        Arrays.sort(array);
        System.out.println(array[1]);

    }



}
