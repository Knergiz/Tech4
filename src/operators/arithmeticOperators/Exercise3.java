package operators.arithmeticOperators;

public class Exercise3 {
    public static void main(String[] args) {

        double avgSal = 90_000.00;

        System.out.println("Monthly Salary is " + (avgSal/12));
        System.out.println("Bi-Weekly Salary is " + (avgSal / 26));
        System.out.println("Weekly Salary is " + (avgSal / 52));
    }
}
