package operators.shortHandAssignmentOperators;

public class Exercise1 {
    public static void main(String[] args) {

        int a = 8, b = 3;

        System.out.println("a += b now is " + (a += b));
        System.out.println("a -= b now is " + (a -= b));
        System.out.println("a *= b now is " + (a *= b));
        System.out.println("a /= b now is " + (a /= b));
        System.out.println("a %= b now is " + (a %= b));


    }
}
