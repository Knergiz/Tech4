package scanner;
import java.util.Scanner;

public class LearningScannerPrimitiveMethods {
    public static void main(String[] args){
        /*
        1. Create object of Scanner (first import)
        ClassName/DataType variableName = new ClassName/DataType();
        2. variableName.methodName();
                 */

    Scanner collect = new Scanner(System.in);

    System.out.println("What is your Age?");
    int userAge = collect.nextInt();

    System.out.println("What is your account ballance?");
    float accountBalance = collect.nextFloat();

    System.out.println("Are you understanding this java class today?");
    boolean answer = collect.nextBoolean();

    System.out.println("User Age is = " + userAge);
    System.out.println("Account Balance is = " + accountBalance);
    System.out.println("You are understanding Java today = " + answer);



    }
}
