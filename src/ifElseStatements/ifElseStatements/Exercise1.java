package ifElseStatements.ifElseStatements;

public class Exercise1 {
    public static void main(String[] args) {

        int num1 = (int) (Math.random() * 46) + 45;
        int num2 = (int) (Math.random() * 46) + 45;
        int num3 = (int) (Math.random() * 46) + 45;

        Math.max(num1, num2);

        int max = Math.max(Math.max(num1, num2), num3);
        int min = Math.min(Math.min(num1, num2), num3);
        int mid = 0;

        if (num1 != max && num1 != min){ //if num1 is NOT max and NOT min, it is the middle number
            mid = num1;
        }else if (num2 != max && num2 != min){
            mid = num2;
        }else{
            mid = num3;
        }

        System.out.println(
                "num1 is: " + num1 +
              "\nnum2 is: " + num2 +
              "\nnum3 is: " + num3 +
              "\nmax is: " + max +
              "\nmin is: " + min +
              "\nmid is: " + mid
        );

    }
}
