package collections.arrayList;

import java.util.ArrayList;

public class AddingAllAndRemovingAll {
    public static void main(String[] args) {

        //task 1
        ArrayList<String> germanCars = new ArrayList<>();

        germanCars.add("BMW");
        germanCars.add("Mercedes");
        germanCars.add("Volkswagen");

        System.out.println("German cars = " + germanCars);

        //task 2
        ArrayList<String> japaneseCars = new ArrayList<>();

        japaneseCars.add("Honda");
        japaneseCars.add("Toyota");
        japaneseCars.add("Lexus");

        System.out.println("Japanese cars = " + japaneseCars);

        //task 3
        ArrayList<String> luxuryCars = new ArrayList<>();

        luxuryCars.add("Maserati");
        luxuryCars.add("Tesla");
        luxuryCars.add("Range Rover");
        luxuryCars.add("Jaguar");

        System.out.println("Luxury cars = " + luxuryCars);

        //task 5       put all together

        ArrayList<String> inventory = new ArrayList<>();
        inventory.addAll(germanCars);
        inventory.addAll(japaneseCars);
        inventory.addAll(luxuryCars);
        System.out.println("Everything currently available in inventory = " + inventory);













    }
}
