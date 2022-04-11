package mathClass;
import java.util.Scanner;
public class ExerciseMaxAndMin {
    public static void main(String[] args) {

        int x = 4, y = 67, z = -54;
        int maxOfXY = Math.max(x,y), maxOfAll = Math.max(maxOfXY, z),
                minOfXY = Math.min(x,y), minOfAll = Math.min(minOfXY, z);

        System.out.println(maxOfAll);
        System.out.println(minOfAll);

        //4, 56 23

        int a = 4, b = 56, c = 23;
        System.out.println("Max of given numbers is: " + Math.max(Math.max(a, b), c));

        // ask user for 4 numbers, print max of numbers

        Scanner inputData = new Scanner(System.in);

        System.out.println("Please enter 4 numbers: ");
        int num1 = inputData.nextInt();
        int num2 = inputData.nextInt();
        int num3 = inputData.nextInt();
        int num4 = inputData.nextInt();

        System.out.println("Largest number from retrieved numbers it: " +
                Math.max(Math.max(num1 , num1),Math.max(num3, num4)));




    }
}
