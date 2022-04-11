package operators.arithmeticOperators;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of \"A\"?");
        int a = input.nextInt();

        System.out.println("What is the length of \"B\"?");
        int b = input.nextInt();

        System.out.println("The perimeter of the square is = " + (a+a+b+b));
        System.out.println("The area of the square is = " + (a*b));

    }
}
