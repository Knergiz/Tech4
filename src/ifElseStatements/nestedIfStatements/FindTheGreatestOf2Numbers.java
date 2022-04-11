package ifElseStatements.nestedIfStatements;

public class FindTheGreatestOf2Numbers {
    public static void main(String[] args) {

        int num1 = (int) (Math.random() * 11), num2 = (int) (Math.random() * 11);

        System.out.println(num1);
        System.out.println(num2);

        //max
        System.out.println("The greatest number between " + num1 + " and " + num2 + " is " + Math.max(num1, num2));

        //max found through if,else statement

        if (num1 > num2){
            System.out.println("The greatest number between " + num1 + " and " + num2 + " is " + num1);
        }else{
            System.out.println("The greatest number between " + num1 + " and " + num2 + " is " + num2);
        }

    }
}
