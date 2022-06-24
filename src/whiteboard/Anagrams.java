package whiteboard;

public class Anagrams{

        public static boolean isAnagram(String str1, String str2){

                StringBuilder s1 = new StringBuilder(str1);
                StringBuilder s2 = new StringBuilder(str2);

                for (int i = 0; i < str1.length(); i++) {
                        for (int j = 0; j < str1.length(); j++) {
                                if (s1.charAt(i) == s2.charAt(j)){
                                        s1.deleteCharAt(i);
                                        s2.deleteCharAt(j);
                                }
                        }
                }
                if (s1.toString().isEmpty() && s2.toString().isEmpty()) {
                        return true;
                }else return false;
        }


        public static void main(String[] args) {
                System.out.println(isAnagram("liam", "mila"));
        }








}
