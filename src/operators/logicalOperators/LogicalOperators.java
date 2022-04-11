package operators.logicalOperators;

public class LogicalOperators {
    public static void main(String[] args){

        boolean isInterviewQuestionsSent = true;
        boolean isJavaHomeworkSent = false;

        // "Or" Statement
        // send me interview questions OR java homework
        System.out.println("The student is okay: " + (isInterviewQuestionsSent || isJavaHomeworkSent));

        // "And" Statement
        // send me interview questions AND java homework
        System.out.println("The student is okay: " + (isInterviewQuestionsSent && isJavaHomeworkSent));

    }
}
