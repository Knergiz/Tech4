package ifElseStatements.ifElseStatements;
import java.util.Scanner;
public class DividableBy7 {
    public static void main(String[] args) {

        Scanner inputData = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num = inputData.nextInt();

        if (num % 7 == 0){
            System.out.println("Your number is divisible by 7!");

        }else System.out.println("Your number is not divisible by 7 :(");

    }
}
