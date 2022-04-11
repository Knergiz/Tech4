package ifElseStatements.ifElseIfStatements;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {

        Scanner inputData = new Scanner(System.in);

        System.out.println("Please enter your age");
        int age = inputData.nextInt();

        System.out.println("Please enter your weight");
        double weight = inputData.nextDouble();

        if (age >= 18){
            System.out.println("You are old enough to drive!");
        }else{
            System.out.println("You are too young to drive :(");
        }
        if (weight > 150){
            System.out.println("You are heavier than 150 lbs");
        }else if(weight == 150){
            System.out.println("You weigh 150!");
        }else {
            System.out.println("You are lighter than 150 lbs");
        }


    }
}
