package collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class _02_Practice_Removing_Duplicates {
    public static void main(String[] args) {

        //task1
        List<String> objects = new ArrayList<>();
        objects.add("Cup");
        objects.add("Book");
        objects.add("Pen");
        objects.add("Cup");
        objects.add("Book");
        objects.add("Book");
        objects.add("Pencil");
        for (int j = 0; j < objects.size(); j++){
            for (int i = j + 1; i < objects.size(); i++) {
                if (objects.get(j).equals(objects.get(i))){
                    objects.remove(objects.get(j));
                }
            }
        }
        System.out.println(objects);





    }
}
