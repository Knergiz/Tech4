package scanner;

import java.util.Scanner;

public class LearningScannerMultipleLines {
    public static void main(String[] args){

        //DataType variableName = data/value;
        //DataType/ClassName variableName = new DataType/ClassName();
        Scanner inputReader = new Scanner(System.in);

        System.out.println("Where is your address?");
        String userAddress = inputReader.nextLine(); //variableName.methodName();

        System.out.println("User address is " + "\"" + userAddress + "\"");


    }
}
