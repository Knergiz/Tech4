package scanner;
import java.util.Scanner;

public class ScannerExercises {
    public static void main(String[] args){

        Scanner inputData = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName = inputData.next();

        System.out.println("What is your last name?");
        String lastName = inputData.next();

        System.out.println("Your full name is \"" + firstName + " " + lastName +"\"");

        System.out.println("What is your address?");
        inputData.nextLine();
        String address = inputData.nextLine();

        System.out.println("Your address is \"" + address + "\"");
    }
}
