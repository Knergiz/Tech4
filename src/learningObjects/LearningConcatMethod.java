package learningObjects;

public class LearningConcatMethod {
    public static void main(String[] args){

        String tech = "Tech";
        String global ="Global";

        String school1 = tech + global;
        String school2 = tech.concat(global);

        System.out.println(school1 + "\n" + school2);

        String myName = "Kerem";
        String myLastName = "Nergiz";
        String myFullName = "Kerem Nergiz";
        String fullName = myName.concat(myLastName);





    }
}
