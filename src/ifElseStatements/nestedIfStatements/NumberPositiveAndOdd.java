package ifElseStatements.nestedIfStatements;

public class NumberPositiveAndOdd {
    public static void main(String[] args) {

        int n = (int)(Math.random() * 101) -50;
        System.out.println(n);
        if (n > 0){

            //number is confirmed to be positive here, nested code will only commence if it is true
            if(n % 2 != 0){
                System.out.println("Number is positive and odd");

            }else{
                System.out.println("Number is positive and even");
            }

        } else if (n < 0) {

            if (n % 2 != 0){
                System.out.println("Number is negative and odd");
            }else{
                System.out.println("Number is negative and even");

            }
        }


    }
}
