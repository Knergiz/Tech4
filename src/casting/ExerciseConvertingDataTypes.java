package casting;

public class ExerciseConvertingDataTypes {
    public static void main(String[] args){

        String num1 = "23", num2 = "25";

        int num1int = Integer.parseInt(num1);
        int num2int = Integer.parseInt(num2);

        Integer num1Integer = Integer.valueOf(num1);
        Integer num2Integer = Integer.valueOf(num2);

        System.out.println("Avg with int is: " + (num1int + num2int / 2));
        System.out.println("Avg with integer is: " + (num1Integer + num2Integer / 2));


        // next task

        String save = "390";
        String day = "15.60";

        double saveDouble = Double.parseDouble(save);
        double dayDouble = Double.parseDouble(day);

        System.out.println((int) saveDouble / dayDouble);





    }
}
