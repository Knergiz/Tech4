package mathClass;

public class FindRandom {
    public static void main(String[] args){

        double random = Math.random();
        System.out.println(random);

        int random0to20 = (int) (Math.random() * 21); //0 to 20
        System.out.println(random0to20);

        int random10to20 = (int) (Math.random() * 11 + 10);
        System.out.println(random10to20);

        int random103to346Included = 103 + (int) (Math.random() * 244);
        System.out.println(random103to346Included);

        int random_50and50included = (int) (Math.random() * 101) -50;
        System.out.println(random_50and50included);

    }
}
