package project;
import java.util.Scanner;
public class Project02 {
    public static void main(String[] args){

        // task 1
    Scanner inputData = new Scanner(System.in);
        System.out.println("Please enter 3 numbers: ");
        int num1 = inputData.nextInt();
        int num2 = inputData.nextInt();
        int num3 = inputData.nextInt();
        System.out.println("The product of the numbers entered is: " + (num1 * num2 * num3) + "\n");

        // task 2
        System.out.println("Please enter your first name: ");
        inputData.nextLine();
        String firstName = inputData.nextLine();

        System.out.println("Please enter your last name: ");
        String lastName = inputData.nextLine();

        System.out.println("Please enter your year of birth: ");
        int birthYear = inputData.nextInt();

        System.out.println(firstName + " " + lastName + "'s age is " + (2022 - birthYear) + "\n");

        // task 3
        System.out.println("Please enter your full name: ");
        inputData.nextLine();
        String fullName = inputData.nextLine();

        System.out.println("Please enter your weight (Kg): ");
        double kg = inputData.nextDouble();

        System.out.println(fullName + "'s weight is " + (kg * 2.205) + " Lbs");

        // task 4
        System.out.println("Please enter your full name: ");
        inputData.nextLine();
        String student1Name = inputData.nextLine();
        System.out.println("Please enter your age: ");
        int student1Age = inputData.nextInt();

        System.out.println("Please enter your full name: ");
        inputData.nextLine();
        String student2Name = inputData.nextLine();
        System.out.println("Please enter your age: ");
        int student2Age = inputData.nextInt();

        System.out.println("Please enter your full name: ");
        inputData.nextLine();
        String student3Name = inputData.nextLine();
        System.out.println("Please enter your age: ");
        int student3Age = inputData.nextInt();

        System.out.println(student1Name + "'s age is " + student1Age);
        System.out.println(student2Name + "'s age is " + student2Age);
        System.out.println(student3Name + "'s age is " + student3Age);

        int avg = (student1Age + student2Age + student3Age) /3;
        System.out.println("The average age is " + avg);

        int maxOf1And2 = Math.max(student1Age, student2Age);
        int maxOfAll = Math.max(maxOf1And2, student3Age);
        System.out.println("The eldest age is " + maxOfAll);

        int minOf1And2 = Math.min(student1Age, student2Age);
        int minOfAll = Math.min(minOf1And2, student3Age);
        System.out.println("The youngest age is " + minOfAll);

    }
}
