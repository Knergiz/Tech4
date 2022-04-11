package casting;
import java.util.Scanner;
public class ExerciseRecap {
    public static void main(String[] args) {

        Scanner inputData = new Scanner(System.in);

        System.out.println("Please enter your full name: ");
        String fullName = inputData.nextLine();
        System.out.println("Please enter your age: ");
        String age = inputData.nextLine();
        System.out.println("Please enter your phone number: ");
        String phoneNumber = inputData.nextLine();
        System.out.println("Please enter your children's ages: ");
        String kid1 = inputData.nextLine();
        String kid2 = inputData.nextLine();
        String kid3 = inputData.nextLine();

        int kid1Int = Integer.parseInt(kid1), kid2Int = Integer.parseInt(kid2),
                kid3Int = Integer.parseInt(kid3);
        int oldestKid = Math.max(Math.max(kid1Int, kid2Int), kid3Int);
        int youngestKid = Math.min(Math.min(kid1Int, kid2Int), kid3Int);
        int difference = oldestKid - youngestKid;

        System.out.println("Your full name is " + fullName + ", Your phone number is " +
                            phoneNumber + ", Your are " + age + " years old, \nYour " +
                "oldest child is " + oldestKid + " years old, Your youngest child is " +
                youngestKid + " years old, \nThe difference between oldest and youngest is " +
                difference + " years.");

    }
}
