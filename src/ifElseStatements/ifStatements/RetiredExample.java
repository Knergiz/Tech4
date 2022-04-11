package ifElseStatements.ifStatements;
import java.util.Scanner;
public class RetiredExample {
    public static void main(String[] args) {

        Scanner inputData = new Scanner(System.in);
        System.out.println("Please enter your age: ");

        int age = inputData.nextInt();

        boolean ifAgeIsMoreThanOrEqualTo55 = age >= 55;

        if (ifAgeIsMoreThanOrEqualTo55){
            System.out.println("Its your time to get retired!");
        } else{
            System.out.println("You still have time before you retire");
        }


    }
}
