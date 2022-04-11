package operators.shortHandAssignmentOperators;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your balance:");
        double balance = input.nextDouble();

        System.out.println("Please enter your first transaction");
        double firstTrans = input.nextDouble();
        balance -= firstTrans;

        System.out.println("Your balance is now: $" + balance);
        System.out.println("Please enter your second transaction:");
        double secondTrans = input.nextDouble();
        balance -= secondTrans;

        System.out.println("Your balance is now: $" + balance);
        System.out.println("Please enter your third transaction:");
        double thirdTrans = input.nextDouble();
        balance -= thirdTrans;

        System.out.println("Your balance is now: $" + balance);

    }
}
