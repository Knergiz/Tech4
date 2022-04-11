package scanner;
import java.util.Scanner;
public class ScannerNextLineProblem {
    public static void main(String[] args){

        Scanner inputData = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = inputData.next();

        System.out.println("What is your age?");
        int age = inputData.nextInt();

        System.out.println("Is your brain fried?");
        boolean answer = inputData.nextBoolean();

        System.out.println("What is your favorite quote?");
        inputData.nextLine();
        String quote = inputData.nextLine();

        System.out.println("Your first name is \"" + name + "\"");
        System.out.println("Your age is \"" + age + "\"");
        System.out.println("Your brain is fried: \"" + answer + "\"");
        System.out.println("Your favorite quote is \"" + quote + "\"");

        System.out.println("Enter your first number");
        int number1 = inputData.nextInt();
        System.out.println("Enter your second number");
        int number2 = inputData.nextInt();
        System.out.println("Enter your third number");
        int number3 = inputData.nextInt();

        System.out.println("The sum of your numbers are " + (number1 + number2 + number3));

    }

}
