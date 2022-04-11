package homework;
import java.util.Scanner;
public class Homework03 {
    public static void main(String[] args){

        // task 1
        // Creating scanner
        Scanner inputData = new Scanner(System.in);

        // First number input
        System.out.println("Please enter your first number: ");
        int num1 = inputData.nextInt();

        // Second number input
        System.out.println("Please enter your second number: ");
        int num2 = inputData.nextInt();

        // Output + sum
        System.out.println("The first number entered by user is: \"" + num1 + "\"");
        System.out.println("The second number entered by user is: \"" + num2 + "\"");
        System.out.println("The sum of number 1 and 2 entered by user is: \"" + (num1+num2) + "\"\n");

        // task 2
        // First number input
        System.out.println("Please enter your first floating number: ");
        double decimal1 = inputData.nextDouble();

        // Second number input
        System.out.println("Please enter your second floating number: ");
        double decimal2 = inputData.nextDouble();

        // Output + division
        System.out.println("Number 1 entered by user is : \"" + decimal1 + "\"");
        System.out.println("Number 2 entered by user is : \"" + decimal2 + "\"");
        System.out.println("The division of number 1 and 2 entered by user is : \"" + (decimal1 / decimal2) + "\"\n");

        // task 3
        // equation solving
        System.out.println("-10 + 7 * 5 = " + (-10 + 7 * 5));
        System.out.println("(72+24) % 24 = " + ((72+24) % 24));
        System.out.println("10 + -3*9 / 9 = " + (10 + -3*9 / 9));
        System.out.println("5 + 18 / 3 * 3 – (6 % 3) = " + (5 + 18 / 3 * 3 - (6 % 3)) + "\n");

        // task 4
        System.out.println("Please enter your first floating number: ");
        double doob1 = inputData.nextDouble();
        System.out.println("Please enter your second floating number: ");
        double doob2 = inputData.nextDouble();

        System.out.println("The sum of the given numbers is : " + (doob1 + doob2));
        System.out.println("The product of the given numbers is : " + (doob1 * doob2));
        System.out.println("The subtraction of the given numbers is : " + (doob1 - doob2));
        System.out.println("The division of the given numbers is : " + (doob1 / doob2));
        System.out.println("The remainder of the given numbers is : " + (doob1 % doob2) + "\n");

        // task 5
        double width = 7.5;
        double length = 10.5;
        System.out.println("The width of the rectangle is : 7.5");
        System.out.println("The length of the rectangle is : 10.5");

        System.out.println("The area of the rectangle is : " + (width * length));
        System.out.println("The perimeter of the rectangle is : " + (width + width + length + length) + "\n");

        // task 6
        double sal = 90_000;
        System.out.println("The annual rate of salary for a Software Engineer in Test is $90k");
        System.out.println("A software engineer in test can earn $" + (sal * 3) + " in three years");

    }
}
