package arrays;

public class _04_Practice_Partial_Arrays {
    public static void main(String[] args) {

        //task1
        int[] numbers = {10, -3, -7, 0, 0, 7, 22};
        for (int number : numbers){
            System.out.println(number);
        }

        //task2
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println("The sum of the numbers is: " + sum);

        //task3
        int sum2 = 0;
        for (int i = 0; i < 3; i++){
            sum2 += numbers[i];
        }
        System.out.println("The sum of the first three numbers is: " + sum2);

        //task4
        int sum3 = 0;
        for (int i = numbers.length-1; i >= numbers.length-5; i--){
            sum3 += numbers[i];
        }
        System.out.println("The sum of the last 5 numbers is: " + sum3);

        //task5
        int product = 1;
        for (int i = numbers.length-1; i >= numbers.length-4; i--){
            if (numbers[i] != 0){
                product *= numbers[i];
            }
        }
        System.out.println("The product of the last four elements is: " + product);

        //task6
        boolean tOrF = false;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == 0){
                tOrF = true;
                break;
            }
        }
        System.out.println(tOrF);





    }
}
