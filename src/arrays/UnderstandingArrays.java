package arrays;

import java.util.Arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {
        //declaring arrays
        String[] names ={"Kerem", "Dana"};
        int[] age = {19, 18};

        //printing arrays
        System.out.println(names[0] + "'s age is " + age[0]);
        System.out.println(names[1] + "'s age is " + age[1]);

        //converting array to a string (basically listing them)
        System.out.println(Arrays.toString(names));

        //looping with arrays
        for (int i = 0; i <= 1; i++){
            System.out.println(names[i] + " is " + age[i] + " years old!");
        }

        //finding size of array
        System.out.println(names.length);


    }



}
