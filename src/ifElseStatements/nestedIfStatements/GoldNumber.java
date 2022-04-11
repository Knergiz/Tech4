package ifElseStatements.nestedIfStatements;

public class GoldNumber {
    public static void main(String[] args) {

        int rndmNum = (int) (Math.random() * 101) - 50;
        int points = 0;

        System.out.println(rndmNum);

        //positive
        if (rndmNum > 0){
            System.out.println("Number is positive");
            points += 10;
            System.out.println("10 points awarded");
            System.out.println("Point balance: " + points + "\n");

        }if (rndmNum > 25){
            System.out.println("Number is above 25!");
            points += 25;
            System.out.println("25 bonus points awarded");
            System.out.println("Point balance: " + points + "\n");

        }if (rndmNum == 7){
            System.out.println("You got the gold number!!!");
            points += 100;
            System.out.println("100 bonus points awarded :)");
            System.out.println("Point balance: " + points + "\n");

        }else if (rndmNum < 0){
            System.out.println("Number is negative :(\nTry again loser");
        }


    }
}
