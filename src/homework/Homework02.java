package homework;
import java.util.Scanner;
public class Homework02 {
    public static void main(String[] args){

        //task 1
    Scanner inputData = new Scanner(System.in);

    System.out.println("What is your first name? ");
    String firstName = inputData.next();

    System.out.println("What is your last name? ");
    String lastName = inputData.next();

    System.out.println("What is your age? ");
    int age = inputData.nextInt();
    inputData.nextLine();

    System.out.println("What is your email address? ");
    String email = inputData.nextLine();

    System.out.println("What is your phone number? ");
    String phone = inputData.nextLine();

    System.out.println("What is your address? ");
    String address = inputData.nextLine();

        System.out.println("Your first name is \"" + firstName + "\"");
        System.out.println("Your last name is \"" + lastName + "\"");
        System.out.println("Your age is \"" + age + "\"");
        System.out.println("Your email address is \"" + email + "\"");
        System.out.println("Your phone number is \"" + phone + "\"");
        System.out.println("Your address is \"" + address + "\"\n");

        //task 2
    System.out.println("What is your favorite book? ");
    String book = inputData.nextLine();

    System.out.println("What is your favorite color? ");
    String color = inputData.nextLine();

    System.out.println("What is your favorite number? ");
    int favNumber = inputData.nextInt();

    System.out.println("Your favorite book is \"" + book + "\"\n" +
                        "Your favorite color is \"" + color + "\"\n" +
                        "Your favorite number is \"" + favNumber + "\"");
    }
}
