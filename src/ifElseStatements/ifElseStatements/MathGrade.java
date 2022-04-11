package ifElseStatements.ifElseStatements;
import  java.util.Scanner;
public class MathGrade {
    public static void main(String[] args) {

        Scanner inputData = new Scanner(System.in);

        System.out.println("What is your name: ");
        String name = inputData.nextLine();

        System.out.println("Hey " + name + ", what is your balance: ");
        double balance = inputData.nextDouble();

        boolean isBalOverOrEqualTo600 = balance >= 600;

        if(isBalOverOrEqualTo600){
            System.out.println("You have enough money!");
        }else System.out.println("You are broke :(");

    }
}
