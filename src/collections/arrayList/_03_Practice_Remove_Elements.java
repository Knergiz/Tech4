package collections.arrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class _03_Practice_Remove_Elements {
    public static void main(String[] args) {

        List<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("JavaScript");
        languages.add("C#");
        languages.add("Python");
        languages.add("C++");

        //[Java, JavaScript, C#, Python, C++]

        /*
        Remove Python from the list and print it

        [Java, JavaScript, C#, C++]
         */

        languages.remove("Python");
        System.out.println(languages);

        for (int i = 0; i < languages.size(); i++){
            if (languages.get(i).toLowerCase().charAt(0) == 'j'){
                languages.remove(languages.get(i));
                i--;
            }
        }
        System.out.println(languages);

        languages.removeIf(element -> element.toLowerCase().startsWith("j"));
        System.out.println(languages);


        Iterator<String> iterator = languages.iterator();

        while(iterator.hasNext()){
            String element = iterator.next();
            if (element.startsWith("J")) iterator.remove();
        }








    }
    }

