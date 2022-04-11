package ifElseStatements.ifStatements;

public class BalanceExamples {
    public static void main(String[] args) {

        double balance = 150;

        boolean isBalanceLessThan0 = balance < 0;
        boolean isBalanceEqualTo100 = balance == 0;
        boolean isBalanceBiggerOrEqualThan1000 = balance >= 1000;
        boolean isBalanceNotEqualToNegative1 = balance != -1;

        if (isBalanceLessThan0){
            // the code that will be executed must be in these curly braces
            System.out.println("Your balance is under 0");

        }

    }
}
