package collections.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LoopingThroughArrayListElements {
    public static void main(String[] args) {

        System.out.println("- - - - - Printing char list - - - - -\n");
        ArrayList<Character> chars = new ArrayList<>();
        chars.add('D');
        chars.add('A');
        chars.add('B');
        chars.add('C');

        System.out.println("My list before sort = " + chars);
        Collections.sort(chars);
        System.out.println("My list after sort = " + chars);

        System.out.println("\n- - - - - Printing each element with fori loop - - - - -\n");
        for (int i = 0; i < chars.toArray().length; i++) {
            System.out.println(chars.get(i));
        }

        System.out.println("\n- - - - - Printing each element with for each loop - - - - -\n");
        for (char element : chars){
            System.out.println(element);
        }















    }
}
