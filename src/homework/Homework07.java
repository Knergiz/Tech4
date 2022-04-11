package homework;
import java.util.Scanner;
public class Homework07 {
    public static void main(String[] args) {

        //task1
        System.out.println("Task 1: \n");

        int rndmNum1 =(int) (Math.random() * 11);
        int rndmNum2 =(int) (Math.random() * 11);
        int rndmNum3 =(int) (Math.random() * 11);
        int rndmNum4 =(int) (Math.random() * 11);

        System.out.println("Number 1 = " + rndmNum1);
        System.out.println("Number 2 = " + rndmNum2);
        System.out.println("Number 3 = " + rndmNum3);
        System.out.println("Number 4 = " + rndmNum4 + "\n");

        System.out.println("Absolute difference of " + rndmNum1 + " and 5 is = " + Math.abs(rndmNum1 % 5));
        System.out.println("Absolute difference of " + rndmNum2 + " and 5 is = " + Math.abs(rndmNum2 % 5));
        System.out.println("Absolute difference of " + rndmNum3 + " and 5 is = " + Math.abs(rndmNum3 % 5));
        System.out.println("Absolute difference of " + rndmNum4 + " and 5 is = " + Math.abs(rndmNum4 % 5) + "\n");

        System.out.println("Greatest number is = " + Math.max(Math.max(Math.max(rndmNum1, rndmNum2), rndmNum3), rndmNum4));
        System.out.println("Smallest number is = " + Math.min(Math.min(Math.min(rndmNum1, rndmNum2), rndmNum3), rndmNum4));

        //task2
        System.out.println("\nTask 2: \n");

        int randomInt1 = (int) (Math.random() * 101) - 50;
        int randomInt2 = (int) (Math.random() * 101) - 50;
        int randomInt3 = (int) (Math.random() * 101) - 50;
        int randomInt4 = (int) (Math.random() * 101) - 50;
        int randomInt5 = (int) (Math.random() * 101) - 50;
        int randomInt6 = (int) (Math.random() * 101) - 50;
        int randomInt7 = (int) (Math.random() * 101) - 50;
        int randomInt8 = (int) (Math.random() * 101) - 50;

        System.out.println("Number 1 = " + randomInt1);
        System.out.println("Number 2 = " + randomInt2);
        System.out.println("Number 3 = " + randomInt3);
        System.out.println("Number 4 = " + randomInt4);
        System.out.println("Number 5 = " + randomInt5);
        System.out.println("Number 6 = " + randomInt6);
        System.out.println("Number 7 = " + randomInt7);
        System.out.println("Number 8 = " + randomInt8);

        int max = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(randomInt1, randomInt2),
                randomInt3), randomInt4), randomInt5), randomInt6), randomInt7), randomInt8);
        int min = Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min
                (randomInt1, randomInt2), randomInt3), randomInt4), randomInt5), randomInt6), randomInt7), randomInt8);

        System.out.println("The greatest number is = " + max);
        System.out.println("The smallest number is = " + min);

        System.out.println("The average of 8 numbers is = " + ((randomInt1 + randomInt2 + randomInt3 + randomInt4
                + randomInt5 + randomInt6 + randomInt7 + randomInt8) / 8));
        System.out.println("Absolute difference between smallest and greatest is = " + ((min + max) / 2));

        if (randomInt3 > 0){
            System.out.println("3rd number is positive = true");
        }else if (randomInt3 < 0){
            System.out.println("3rd number is positive = false");
        }else {
            System.out.println("3rd number is positive = undefined(num = 0)");
        }

        if (randomInt5 > 0){
            System.out.println("5th number is negative = false");
        }else if (randomInt5 < 0){
            System.out.println("5th number is negative = true");
        }else {
            System.out.println("5th number is negative = undefined(num = 0)");
        }

        if (randomInt1 == 0){
            System.out.println("There is at least one zero among those numbers is = true");
        }else if (randomInt2 == 0){
            System.out.println("There is at least one zero among those numbers is = true");
        }else if (randomInt3 == 0){
            System.out.println("There is at least one zero among those numbers is = true");
        }else if (randomInt4 == 0){
            System.out.println("There is at least one zero among those numbers is = true");
        }else if (randomInt5 == 0){
            System.out.println("There is at least one zero among those numbers is = true");
        }else if (randomInt6 == 0){
            System.out.println("There is at least one zero among those numbers is = true");
        }else if (randomInt7 == 0){
            System.out.println("There is at least one zero among those numbers is = true");
        }else if (randomInt8 == 0){
            System.out.println("There is at least one zero among those numbers is = true");
        }else{
            System.out.println("There is at least one zero among those numbers is = false");
        }

        //task3
        System.out.println("\nTask 4: \n");

        Scanner inputData = new Scanner(System.in);
        System.out.println("Please enter 7 numbers between 0 and 50");
        int num1 = inputData.nextInt();
        int num2 = inputData.nextInt();
        int num3 = inputData.nextInt();
        int num4 = inputData.nextInt();
        int num5 = inputData.nextInt();
        int num6 = inputData.nextInt();
        int num7 = inputData.nextInt();

        System.out.println("Number 1 = " + num1);
        System.out.println("Number 2 = " + num2);
        System.out.println("Number 3 = " + num3);
        System.out.println("Number 4 = " + num4);
        System.out.println("Number 5 = " + num5);
        System.out.println("Number 6 = " + num6);
        System.out.println("Number 7 = " + num7);

        System.out.println("The greatest number is = " + Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(num1, num2),
                num3), num4), num5), num6), num7));
        System.out.println("The smallest number is = " + Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(num1, num2),
                num3), num4), num5), num6), num7));
        System.out.println("The average of 7 numbers is = " + ((num1 + num2 + num3 + num4 + num5 + num6 + num7) / 7));

        if (num1 >= 10){
            System.out.println("First number is greater than or equal to 10 = true");
        }else{
            System.out.println("First number is greater than or equal to 10 = false");
        }

        if (num7 <= 40){
            System.out.println("Last number is less than or equal to 40 = true");
        }else{
            System.out.println("Last number is less than or equal to 40 = false");
        }

        if (num1 > 25 && num7 > 25){
            System.out.println("Both first and last numbers are greater than 25 = true");
        }else{
            System.out.println("Both first and last numbers are greater than 25 = false");
        }

        if (num1 == 0 || num1 == 50){
            System.out.println("At least one of those numbers is 0 or 50 = true");
        }else if (num2 == 0 || num2 == 50){
            System.out.println("At least one of those numbers is 0 or 50 = true");
        }else if (num3 == 0 || num3 == 50){
            System.out.println("At least one of those numbers is 0 or 50 = true");
        }else if (num4 == 0 || num4 == 50){
            System.out.println("At least one of those numbers is 0 or 50 = true");
        }else if (num5 == 0 || num5 == 50){
            System.out.println("At least one of those numbers is 0 or 50 = true");
        }else if (num6 == 0 || num6 == 50){
            System.out.println("At least one of those numbers is 0 or 50 = true");
        }else if (num7 == 0 || num7 == 50){
            System.out.println("At least one of those numbers is 0 or 50 = true");
        }else{
            System.out.println("At least one of those numbers is 0 or 50 = false");
        }

        if (num1 > 40 && num1 < 50){
            System.out.println("There is no number between 40 and 50 = false");
        }else if (num2 > 40 && num2 < 50){
            System.out.println("There is no number between 40 and 50 = false");
        }else if (num3 > 40 && num3 < 50){
            System.out.println("There is no number between 40 and 50 = false");
        }else if (num4 > 40 && num4 < 50){
            System.out.println("There is no number between 40 and 50 = false");
        }else if (num5 > 40 && num5 < 50){
            System.out.println("There is no number between 40 and 50 = false");
        }else if (num6 > 40 && num6 < 50){
            System.out.println("There is no number between 40 and 50 = false");
        }else if (num7 > 40 && num7 < 50){
            System.out.println("There is no number between 40 and 50 = false");
        }else{
            System.out.println("There is no number between 40 and 50 = true");
        }

        //task4
        System.out.println("\nTask 4: \n");

        int r1 = (int) (Math.random() * 101);
        int r2 = (int) (Math.random() * 101);
        int r3 = (int) (Math.random() * 101);

        System.out.println("First number = " + r1);
        System.out.println("Second number = " + r2);
        System.out.println("Third number = " + r3);

        if (r1 > 25){
            if (r2 > 25){
                if (r3 > 25){
                    System.out.println("All three numbers are greater than 25 = true");
                }
            }
        } else{
            System.out.println("All three numbers are greater than 25 = false");
        }

        //task5
        System.out.println("\nTask 5: \n");

        System.out.println("Please enter a number 1-7 representing the days of the week:");
        System.out.println("1 = Monday\n2 = Tuesday\n3 = Wednesday\n4 = Thursday\n5 = Friday\n6 = Saturday\n7 = Sunday");
        int day = inputData.nextInt();

        if (day == 1){
            System.out.println("The number entered returns \"Monday\"");
        }else if (day == 2){
            System.out.println("The number entered returns \"Tuesday\"");
        }else if (day == 3){
            System.out.println("The number entered returns \"Wednesday\"");
        }else if (day == 4){
            System.out.println("The number entered returns \"Thursday\"");
        }else if (day == 5){
            System.out.println("The number entered returns \"Friday\"");
        }else if (day == 6){
            System.out.println("The number entered returns \"Saturday\"");
        }else if (day == 7){
            System.out.println("The number entered returns \"Sunday\"");
        }else{
            System.out.println("The number entered is an invalid number\nPlease try again");
        }

        //task6
        System.out.println("\nTask 6: \n");

        System.out.println("Please enter a number between -10 and 10:");
        int num = inputData.nextInt();

        if (num <= 10 && num >= -10){
            if (num > 0){
                System.out.println("Number is positive");
            }else if (num < 0){
                System.out.println("Number is negative");
            }else{
                System.out.println("Number is zero");
            }
        }else{
            System.out.println("Number entered is invalid\nPlease try again");
        }

        if (num % 2 == 0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }

        //task7
        System.out.println("\nTask 7: \n");

        System.out.println("Please enter your 3 exam results:");
        int grade1 = inputData.nextInt();
        int grade2 = inputData.nextInt();
        int grade3 = inputData.nextInt();

        if (((grade1 + grade2 + grade3) / 3) >= 70){
            System.out.println("YOU PASSED!");
        }else{
            System.out.println("YOU FAILED!");
        }

        //task8
        System.out.println("\nTask 8: \n");

        System.out.println("Please enter 3 numbers:");
        int match1 = inputData.nextInt();
        int match2 = inputData.nextInt();
        int match3 = inputData.nextInt();

        if (match1 == match2 || match2 == match3 || match1 == match3){
            if (match1 == match2 && match1 == match3){
                System.out.println("TRIPLE MATCH");
            }else{
                System.out.println("DOUBLE MATCH");
            }
        }else{
            System.out.println("NO MATCH");
        }

    }
}
