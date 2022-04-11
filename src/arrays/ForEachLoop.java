package arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        //for i
        char[] chars = {'a', ' ', ',', '#', 'T', '6', '9'};


        for (int i = 0; i <= chars.length -1; i++){
            System.out.println("Element " + (i + 1) + " = " + chars[i]);
        }


        //for each
        int[] numbers = {10, -3, -7, 0, 0, 7, 22};
        for (int number : numbers){
            System.out.println(number);
        }











    }
}
