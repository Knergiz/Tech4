package homework;

public class Homework21 {

    //task 1
    public static void fizzBuzz(int num){
        for (int i = 0; i < num; i++) {

            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if (i % 3 == 0){
                System.out.println("Fizz");
            }else if (i % 5 == 0){
                System.out.println("Buzz");
            } else System.out.println(i);

        }
    }

    //task 2
    public static String fizzBuzz2(int num){
        if (num % 3 == 0 && num % 5 == 0) return "FizzBuzz";
        else if (num % 3 == 0) return "Fizz";
        else if (num % 5 == 0) return "Buzz";
        else  return String.valueOf(num);
    }

    //task 3
    public static int findSumOfNumbers(String str){
        int container = 0;
        str = str.replaceAll("[^0-9]", "");
        for (int i = 0; i < str.length(); i++) {
            container += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return container;
    }

    //task 4
    public static int findBiggestNumber(String str){
        int max = 0;
        str = str.replaceAll("[^0-9]", "");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > max) max = str.charAt(i);
        }
        return max;
    }

    //task 5
    public static String countSequenceOfCharacters(String str){
        if (!str.isEmpty()){
            String placeholder = "";
            for (int i = 0; i < str.length(); i++) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)){
                        placeholder += str.charAt(i);
                        placeholder += "1";
                    }
                }
            }
        }
        return str;
    }
}
