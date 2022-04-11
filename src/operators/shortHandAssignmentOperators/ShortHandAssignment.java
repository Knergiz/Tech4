package operators.shortHandAssignmentOperators;

public class ShortHandAssignment {
    public static void main(String[] args) {

        int age = 5;
        System.out.println(age);

        age = age + 3; //reassignment
        age += 3; //alternative reassignment
        System.out.println(age);
    }
}
