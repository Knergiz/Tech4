import java.util.HashMap;
import java.util.Map;

public class Interview {

    //Requirement:
        //    -Student is responsible to create a main method and test their method.

      //      -Write a method that takes an array of String and returns the count of each unique element in the array as a Map

    //Test Data:
    //        ["Apple", "Apple", "Orange", "Apple", "Kiwi"]

    //Expected:{Apple=3, Orange=1, Kiwi=1}


    public static Map<String, Integer> whiteBoard(String[] array) {
        Map<String, Integer> newResult = new HashMap<>();
        int placeholder = 0;
        for (int i = 0; i < array.length; i++) {
            for (String str : array) {
                if (array[i].equals(str)) {
                    placeholder++;
                }
                newResult.put(array[i], placeholder);
            }
        placeholder = 0;
        }
        return newResult;
    }


    public static void main(String[] args) {

        String[] array = {"Apple", "Apple", "Orange", "Apple", "Kiwi"};

        System.out.println(Interview.whiteBoard(array));


    }


}
