package homework;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {

        //task1
        System.out.println("- - - - - - - Task-1 - - - - - - -");
        int numbers[] = new int[10];
        numbers[2] = 23;
        numbers[4] = 12;
        numbers[7] = 34;
        numbers[9] = 7;
        numbers[6] = 15;
        numbers[0] = 89;
        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);
        System.out.println(Arrays.toString(numbers));

        //task2
        System.out.println("\n- - - - - - - Task-2 - - - - - - -");
        String[] str = new String[5];
        str[1] = "abc";
        str[4] = "xyz";
        System.out.println(str[3]);
        System.out.println(str[0]);
        System.out.println(str[4]);
        System.out.println(Arrays.toString(str));

        //task3
        System.out.println("\n- - - - - - - Task-3 - - - - - - -");
        int[] num = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        //task4
        System.out.println("\n- - - - - - - Task-4 - - - - - - -");
        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));

        //task5
        System.out.println("\n- - - - - - - Task-5 - - - - - - -");
        String[] dogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};
        System.out.println(Arrays.toString(dogs));
        boolean tOrF = false;
        for (int i = 0; i < dogs.length; i++){
            if (dogs[i].equals("Pluto"));{
                tOrF = true;
            }
        }
        System.out.println(tOrF);

        //task6
        System.out.println("\n- - - - - - - Task-6 - - - - - - -");
        String[] cats = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));
        boolean trueOrFalse = false;
        boolean garfield = false;
        boolean felix = false;
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].equals("Garfield")){
                garfield = true;
            }if (cats[i].equals("Felix")){
                felix = true;
            }
        }
        if (garfield == true && felix == true){
            trueOrFalse = true;
        }
        System.out.println(trueOrFalse);

        //task7
        System.out.println("\n- - - - - - - Task-7 - - - - - - -");
        double[] d1 = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(d1));
        for (int i = 0; i < d1.length; i++) {
            System.out.println(d1[i]);
        }

        //task8
        System.out.println("\n- - - - - - - Task-8 - - - - - - -");
        char[] c1 = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};
        System.out.println(Arrays.toString(c1));
        int letters = 0;
        int lowercase = 0;
        int uppercase = 0;
        int digits = 0;
        int special = 0;
        for (int i = 0; i < c1.length; i++) {
            if (Character.isLowerCase(c1[i])){
                lowercase++;
                letters++;
            }else if (Character.isUpperCase(c1[i])){
                uppercase++;
                letters++;
            }else if (Character.isDigit(c1[i])){
                digits++;
            }else special++;
        }
        System.out.println("\nLetters = " + letters);
        System.out.println("Uppercase Letters = " + uppercase);
        System.out.println("Lowercase Letters = " + lowercase);
        System.out.println("Digits = " + digits);
        System.out.println("Special Characters = " + special);

        //task9
        System.out.println("\n- - - - - - - Task-9 - - - - - - -");
        String[] objects = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        System.out.println(Arrays.toString(objects));
        int up = 0;
        int low = 0;
        int bOrP = 0;
        int bookOrPen = 0;
        for (int i = 0; i < objects.length; i++) {
            if (Character.isUpperCase(objects[i].charAt(0))){
                up += 1;
            }else low += 1;
            if (objects[i].charAt(0) == 'b' || objects[i].charAt(0) == 'B' || objects[i].charAt(0) == 'p' || objects[i].charAt(0) == 'P'){
                bOrP += 1;
            }if (objects[i].contains("book") || objects[i].contains("pen") || objects[i].contains("Pen") || objects[i].contains("Book")){
                bookOrPen += 1;
            }
        }
        System.out.println("Elements starting with uppercase = " + up);
        System.out.println("Elements starting with lowercase = " + low);
        System.out.println("Elements starting with B or P = " + bOrP);
        System.out.println("Elements starting with book or pen = " + bookOrPen);

        //task10
        System.out.println("\n- - - - - - - Task-10 - - - - - - -");
        int[] number = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        System.out.println(Arrays.toString(number));
        int moreThan10 = 0;
        int lessThan10 = 0;
        int is10 = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > 10){
             moreThan10 += 1;
            }else if(number[i] < 10){
                lessThan10 += 1;
            }else is10 += 1;
        }
        System.out.println("Elements that are more than 10 = " + moreThan10);
        System.out.println("Elements that are less than 10 = " + lessThan10);
        System.out.println("Elements that are 10 = " + is10);

        //task11
        System.out.println("\n- - - - - - - Task-11 - - - - - - -");
        int[] set1 = {5, 8, 13, 1, 2};
        int[] set2 = {9, 3, 67, 1, 0};
        int[] set3 = new int[5];

        for (int i = 0; i < set1.length; i++) {
            if (set1[i] > set2[i]){
                set3[i] = set1[i];
            }else set3[i] = set2[i];
        }
        System.out.println("1st array is = " + Arrays.toString(set1));
        System.out.println("2nd array is = " + Arrays.toString(set2));
        System.out.println("3rd array is = " + Arrays.toString(set3));





















    }
}
