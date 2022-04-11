package homework;
import java.util.Scanner;
import primitives.Int;

public class Homework06 {
    public static void main(String[] args){

        //task 1
        String s1 = "5", s2 = "10";

        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        System.out.println("Sum of 5 and 10 is " + (num1 + num2));
        System.out.println("Product of 5 and 10 is " + (num1 * num2));
        System.out.println("Division of 5 and 10 is " + (num1 / num2));
        System.out.println("Subtraction of 5 and 10 is " + (num1 - num2));
        System.out.println("Remainder of 5 and 10 is " + (num1 % num2) + "\n");

        //task 2
        String string1 = "200", string2 = "-50";

        int number1 = Integer.parseInt(string1);
        int number2 = Integer.parseInt(string2);

        System.out.println("The max value is " + (Math.max(number1, number2)));
        System.out.println("The min value is " + (Math.min(number1, number2)));
        System.out.println("Average value is " + ((number1 + number2) / 2));
        System.out.println("The absolute value is " + (Math.abs(number1 + number2)) + "\n");

        //task 3
        double daily = 0.96;

        System.out.println((24 / daily) + " days");
        System.out.println((168 / daily) + " days");
        System.out.println("$" + (150 * daily) + "\n");

        //task 4
        double computer = 1250.0;
        double savings = 62.5;
        double howManyDays = computer / savings;

        System.out.println((int) howManyDays + "\n");

        //task 5
        double car = 14_265;
        double option1 = 475.5;
        double option2 = 951;
        double option1months =(int) car / option1;
        double option2months =(int) car / option2;


        System.out.println("Option one will take " + option1months + " months");
        System.out.println("Option one will take " + option2months + " months\n");

        //task 6
        Scanner inputData = new Scanner(System.in);

        int int1 = 15;
        int int2 = 2;

        double int1and2div = int1 / int2;

        System.out.println(int1and2div);
    }
}
