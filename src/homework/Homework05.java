package homework;
import java.util.Scanner;
public class Homework05 {
    public static void main(String[] args){

        Scanner inputData = new Scanner(System.in);

        //task 1
        System.out.println("Please enter your first number: ");
        int num1 = inputData.nextInt();
        System.out.println("Please enter your second number: ");
        int num2 = inputData.nextInt();
        System.out.println("Please enter your third number: ");
        int num3 = inputData.nextInt();

        int max = Math.max(Math.max(num1, num2), num3);
        int min = Math.min(Math.min(num1, num2), num3);

        System.out.println("The max value from given numbers is: " + max);
        System.out.println("The min value from given numbers is: " + min + "\n");

        //task 2

        System.out.println("Please enter your first number: ");
        int int1 = inputData.nextInt();
        System.out.println("Please enter your second number: ");
        int int2 = inputData.nextInt();
        System.out.println("Please enter your third number: ");
        int int3 = inputData.nextInt();
        System.out.println("Please enter your fourth number: ");
        int int4 = inputData.nextInt();
        System.out.println("Please enter your fifth number: ");
        int int5 = inputData.nextInt();

        int maxOfAll = Math.max(int1, Math.max(int2, Math.max(int3, Math.max(int4, int5))));
        int minOfAll = Math.min(int1, Math.min(int2, Math.min(int3, Math.min(int4, int5))));

        System.out.println("The max of the given numbers is: " + maxOfAll);
        System.out.println("The min of the given numbers is: " + minOfAll + "\n");

        //task 3
        System.out.println("Please enter your first number: ");
        int abs1 = inputData.nextInt();
        System.out.println("Please enter your second number: ");
        int abs2 = inputData.nextInt();

        System.out.println("The absolute remainder is: " + Math.abs(abs1 + abs2) + "\n");

        //task 4
        int random50to100Included1 = 50 + (int) (Math.random() * 51);
        int random50to100Included2 = 50 + (int) (Math.random() * 51);
        int random50to100Included3 = 50 + (int) (Math.random() * 51);

        System.out.println("First random number: " + random50to100Included1);
        System.out.println("Second random number: " + random50to100Included2);
        System.out.println("Third random number: " + random50to100Included3);
        System.out.println("The sum of these numbers is: " + (random50to100Included1 + random50to100Included2 + random50to100Included3) + "\n");

        //task 5
        double alex = 125;
        double mike = 220;
        mike -= 25.5;
        alex += 25.5;
        System.out.println(mike);
        System.out.println(alex + "\n");

        //task 6
        double bike = 390;
        double david = 15.6;
        double days = (int) bike/david;
        System.out.println("It will take david " + days + " days to get the bike");


    }
}
