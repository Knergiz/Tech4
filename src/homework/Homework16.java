package homework;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Homework16 {
    //task 1
    public static int countWords(String str){
        int count = 1;
        str = str.trim();
        if (str.contains(" ")){
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' '){
                    count++;
                }
            }
        }
        return count;
    }

    //task 2
    public static int countA(String str){
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') count++;
        }
        return count;
    }

    //task 3
    public static int countPos(ArrayList<Integer> array){
        int count = 0;
        for (int num : array){
            if (num > 0){
                count++;
            }
        }
        return count;
    }

    //task 4
    public static ArrayList removeDuplicateNumbers(ArrayList<Integer> array) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (!temp.contains(array.get(i))) {
                temp.add(array.get(i));
            }
        }
            array = temp;
            return array;

    }
    //task 5
    public static ArrayList removeDuplicateElements(ArrayList<String> array){
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (!temp.contains(array.get(i))){
                temp.add(array.get(i));
            }
        }
        array = temp;
        return array;
    }

    //task 6
    public static String removeExtraSpaces(String str){
        String temp = "";
        str = str.trim();
        temp = str.replaceAll("\\s+", " ");
        str = temp;
        return str;
    }

    //task 7
    public static int[] add(int[] array1, int[] array2) {
        int[] temp = array1;
        for (int i = 0; i < array2.length; i++){
            temp[i] = temp[i] + array2[i];
        }
        return temp;
    }

    //task 8
    public static int findClosestTo10(int[] array){
        int temp = Integer.MAX_VALUE;
        for (int num : array){
            if (num - 10 < temp - 10 && num > 0) temp = num;
        }
        return temp;
    }




}
