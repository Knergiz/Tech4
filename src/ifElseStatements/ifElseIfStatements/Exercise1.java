package ifElseStatements.ifElseIfStatements;

public class Exercise1 {
    public static void main(String[] args) {

        int rndmNeg10to10 = (int) (Math.random() * 21) -10;



        System.out.println(rndmNeg10to10);
        if (rndmNeg10to10 > 0) {
            System.out.println("The number is positive!");
        } else if (rndmNeg10to10 < 0) {
            System.out.println("The number is negative!");
        }else{
            System.out.println("The number is zero!");
        }
    }
}
