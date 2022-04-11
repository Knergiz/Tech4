package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class ConvertingListsToArray {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Rami");
        names.add("Naim");
        names.add("Reem");

        LinkedList<Integer> ages = new LinkedList<>();
        ages.add(25);
        ages.add(26);
        ages.add(27);
        ages.add(30);

        Vector<Boolean> booleans = new Vector<>();
        booleans.add(true);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);

        //conversion (List to array)

        // manual way
        String[] namesAre = new String[names.size()];

        for (int i = 0; i < names.size(); i++) {
            namesAre[i] = names.get(i);
        }
        System.out.println(Arrays.toString(namesAre));

        // toArray() way
        Integer[] agesAre;







        Boolean[] booleansAre;





    }
}
