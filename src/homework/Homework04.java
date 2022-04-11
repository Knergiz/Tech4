package homework;
import java.util.Scanner;
public class Homework04 {
    public static void main(String[] args){

        Scanner inputData = new Scanner(System.in);

        // task 1
        System.out.println("Please enter your first number: ");
        int num1 = inputData.nextInt();
        System.out.println("Please enter your second number: ");
        int num2 = inputData.nextInt();
        System.out.println("The average of the given to numbers is: " +
                ((num1 + num2) /2));

        // task 2
        System.out.println("Please enter your first number: ");
        int multiply1 = inputData.nextInt();
        System.out.println("Please enter your second number: ");
        int multiply2 = inputData.nextInt();
        System.out.println("The product of the numbers entered is: " +
                (multiply1 * multiply2));

        // task 3
        System.out.println("Please enter your first number: ");
        int square1 = inputData.nextInt();
        System.out.println("Please enter your second number: ");
        int square2 = inputData.nextInt();
        System.out.println("Please enter your third number: ");
        int square3 = inputData.nextInt();
        System.out.println(square1 + " squared equals " + (square1 * square1));
        System.out.println(square2 + " squared equals " + (square2 * square2));
        System.out.println(square3 + " squared equals " + (square3 * square3));

        // task 4
        System.out.println("Please enter your first number: ");
        int remainder1 = inputData.nextInt();
        System.out.println("Please enter your second number: ");
        int remainder2 = inputData.nextInt();
        System.out.println("The remainder of " + remainder1 + " % " + remainder2 +
                " = " + (remainder1 % remainder2));

        // task 5
        System.out.println("Please enter your first number: ");
        int avg1 = inputData.nextInt();
        System.out.println("Please enter your second number: ");
        int avg2 = inputData.nextInt();
        System.out.println("Please enter your third number: ");
        int avg3 = inputData.nextInt();
        System.out.println("Please enter your fourth number: ");
        int avg4 = inputData.nextInt();
        System.out.println("Please enter your fifth number: ");
        int avg5 = inputData.nextInt();
        System.out.println("The average of the entered numbers is: " +
                ((avg1 + avg2 + avg3 + avg4 + avg5) /5));

        // task 6
        System.out.println("Please enter a number: ");
        int table = inputData.nextInt();
        System.out.println(table + " * 1 = " + (table * 1) + "\n" +
                                table + " * 2 = " + (table * 2) + "\n" +
                                table + " * 3 = " + (table * 3) + "\n" +
                                table + " * 4 = " + (table * 4) + "\n" +
                                table + " * 5 = " + (table * 5) + "\n" +
                                table + " * 6 = " + (table * 6) + "\n" +
                                table + " * 7 = " + (table * 7) + "\n" +
                                table + " * 8 = " + (table * 8) + "\n" +
                                table + " * 9 = " + (table * 9) + "\n" +
                                table + " * 10 = " + (table * 10) + "\n");

        // task 7
        System.out.println("Please enter the length of one side of the square: ");
        int square = inputData.nextInt();
        System.out.println("The area of the square is: " + (square * square));
        System.out.println("The perimeter of the square is: " + (square * 4));

    }
}
