package ifElseStatements.switchStatements;
import java.util.Scanner;
public class WorkCode {
    public static void main(String[] args){

        Scanner inputData = new Scanner(System.in);

        System.out.println("Please pick a day of the week using 1 - 5\n1 = Monday\n" +
                "2 = Tuesday\n3 = Wednesday\n4 = Thursday\n5 = Friday\n");
        int num = inputData.nextInt();

        if (num == 1){
            System.out.println("You picked monday which is blue!");
        }else if (num == 2){
            System.out.println("You picked tuesday which is red!");
        }else if (num == 3){
            System.out.println("You picked wednesday which is purple!");
        }else if (num == 4){
            System.out.println("You picked thursday which is yellow!");
        }else if (num == 5){
            System.out.println("You picked friday which is orange!");
        }else{
            System.out.println("This is an invalid number\nPlease re-run the program and enter a number 1 - 5");
        }



    }
}
