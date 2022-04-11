package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Exercise01 {
    public static void main(String[] args) {

        String[] c = {"Berlin", "Chicago", "Dallas", "Miami", "Brugge", "Kiev"};

        List<String> cities = new LinkedList<>();

        Collections.addAll(cities, c);

        System.out.println(cities);



    }
}
