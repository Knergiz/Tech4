package mathClass;

public class ExerciseMathRandom {
    public static void main(String[] args){

        //program generatiing random number between 45 and 98, then print

        System.out.println(Math.random() * 54 + 45);

        int rndm1 = (int) Math.random() * 19 + 67;
        int rndm2 = (int) Math.random() * 19 + 67;

        System.out.println("First Number is: " + rndm1 + "\n" +
                "Second number is: " + rndm2 + "\n" +
                "Maximum number is: " + Math.max(rndm1, rndm2) + "\n" +
                "Minimum number is: " + Math.min(rndm1, rndm2));

    }
}
