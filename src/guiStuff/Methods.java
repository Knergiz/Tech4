package guiStuff;

import static guiStuff.Wordle.*;

public class Methods {

    public static String checkLetter(String word, String letter, int index){
        if (letter.contains(String.valueOf(word.charAt(index)))) letter = (ANSI_GREEN + letter + ANSI_RESET);
            else if (word.contains(String.valueOf(letter.charAt(0)))) letter = (ANSI_YELLOW + letter + ANSI_RESET);
        return letter;
    }

    public static boolean isCorrect(String turn, String word, boolean validationNum, int index){
        if (turn.charAt(index) == word.charAt(index)) validationNum = true;
        return validationNum;
    }

}
