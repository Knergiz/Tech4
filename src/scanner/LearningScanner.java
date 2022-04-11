package scanner;

import java.util.Scanner;

public class LearningScanner {
    public static void main(String[] args){

        /*
        1. I am going to use a Scanner class for creating my object
        2. I will use the object for reading the data
         */

        Scanner scanner = new Scanner(System.in); // creating a scanner object

        System.out.println("Please put your first name"); // this is what I want user to put
        String firstName = scanner.next();  // storing first name from the user

        System.out.println("Please put your last name");
        String lastName = scanner.next();

        System.out.println("User's first name = "+ firstName); // printing my object/variable
        System.out.println("User's last name = "+ lastName);

    }
}
