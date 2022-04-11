package arrays;

public class _07_Practice_Find_The_Longest_String {
    public static void main(String[] args) {

        String[] colors = {"red", "blue", "yellow", "white"};

        String str = "";
        for (int i = 0; i < colors.length; i++) {
            if (colors[i].length() > str.length()){
                str = colors[i];
            }
        }
        System.out.println(str);




    }
}
